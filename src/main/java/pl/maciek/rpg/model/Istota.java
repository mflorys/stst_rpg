package pl.maciek.rpg.model;

import interfaces.FunkcjeIstoty;
import service.TworzeniePostaciService;

import java.util.Arrays;
import java.util.List;

public abstract class Istota implements FunkcjeIstoty {

    Integer sila;
    Integer inicjatywa;
    Integer iloscAtakow;
    Integer szybkosc;
    Integer iloscUnikow;
    Integer wytrzymalosc;
    Integer punktyZycia;
    Integer zrecznosc;
    TypPostaci typPostaci;
    TypBroni aktywnaBron;
    List<TypPancerza> pancerze;


    public Istota(Integer sila, Integer inicjatywa, Integer iloscAtakow, Integer szybkosc, Integer iloscUnikow, Integer wytrzymalosc,
                  Integer punktyZycia, Integer zrecznosc, TypPostaci typPostaci, TypBroni aktywnaBron, List<TypPancerza> pancerze) {
        this.sila = sila;
        this.inicjatywa = inicjatywa;
        this.iloscAtakow = iloscAtakow;
        this.szybkosc = szybkosc;
        this.iloscUnikow = iloscUnikow;
        this.wytrzymalosc = wytrzymalosc;
        this.punktyZycia = punktyZycia;
        this.zrecznosc = zrecznosc;
        this.typPostaci = typPostaci;
        this.pancerze = pancerze;
        this.aktywnaBron = aktywnaBron;
    }

    public Integer getInicjatywa() {
        return inicjatywa;
    }

    public void setInicjatywa(Integer inicjatywa) {
        inicjatywa = inicjatywa;
    }

    public Integer getSzybkosc() {
        return szybkosc;
    }

    public void setSzybkosc(Integer szybkosc) {
        this.szybkosc = szybkosc;
    }

    public Integer getIloscUnikow() {
        return iloscUnikow;
    }

    public void setIloscUnikow(Integer iloscUnikow) {
        this.iloscUnikow = iloscUnikow;
    }

    public Integer getWytrzymalosc() {
        return wytrzymalosc;
    }

    public void setWytrzymalosc(Integer wytrzymalosc) {
        this.wytrzymalosc = wytrzymalosc;
    }

    public Integer getPunktyZycia() {
        return punktyZycia;
    }

    public void setPunktyZycia(Integer punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public Integer getIloscAtakow() {

        return iloscAtakow;
    }

    public void setIloscAtakow(Integer iloscAtakow) {
        this.iloscAtakow = iloscAtakow;
    }

    public Integer getSila() {
        return this.sila;
    }

    public void setSila(Integer sila) {
        this.sila = sila;
    }

    public Integer getZrecznosc() {
        return zrecznosc;
    }

    public void setZrecznosc(Integer zrecznosc) {
        this.zrecznosc = zrecznosc;
    }

    public TypPostaci getTypPostaci() {
        return this.typPostaci;
    }

    public int ochronaCzesciCiala(CzesciCiala wCoPiznal) {
        int ochrona = 0;

        for (int i = 0; i < pancerze.size(); i++) {
            if (pancerze.get(i).chronioneCzesciCiala.toString().contains(wCoPiznal.toString())) {
                ochrona += pancerze.get(i).punktyObrony;
            }
        }
        return ochrona;
    }

    public CzesciCiala losujTrafioneMiejsce() {
        CzesciCiala trafioneMiejsce = null;
        int los = TworzeniePostaciService.losuj(0, 99);
        List<CzesciCiala> czesciCiala = Arrays.asList(CzesciCiala.values());
        for (int i = 0; i < czesciCiala.size(); i++) {
            if (los > czesciCiala.get(i).minWartoscTrafienia && los < czesciCiala.get(i).maxWartoscTrafienia) {
                trafioneMiejsce = czesciCiala.get(i);
                break;
            }
        }
        return trafioneMiejsce;
    }

    @Override
    public String toString() {
        return "\n" + typPostaci + " {" +
                "sila=" + sila +
                ", inicjatywa=" + inicjatywa +
                ", iloscAtakow=" + iloscAtakow +
                ", szybkosc=" + szybkosc +
                ", iloscUnikow=" + iloscUnikow +
                ", wytrzymalosc=" + wytrzymalosc +
                ", punktyZycia=" + punktyZycia +
                ", zrecznosc=" + zrecznosc +
                ", aktywnaBron=" + aktywnaBron +
                ", pancerz=" + pancerze.toString() +
                "}";
    }

    @Override
    public WynikUderzenia atak(Istota ofiara) {
        WynikUderzenia wynikUderzenia = new WynikUderzenia();
        wynikUderzenia.setPotencjalneObrazenia(getSila() + losowanie(0, 3));

        if (getZrecznosc() > losowanie(1, 10)) {
            System.out.println(getTypPostaci().name() + " zadal cios.");
            wynikUderzenia.setTrafioneMiejsce(losujTrafioneMiejsce());
            return wynikUderzenia;
        } else {
            System.out.println(getTypPostaci().name() + " chybil.");
            wynikUderzenia.setTrafioneMiejsce(null);
            return wynikUderzenia;
        }
    }

    @Override
    public void unik(WynikUderzenia uderzenie) {
        if (uderzenie.getTrafioneMiejsce() == null) {
            return;
        }

        if (getInicjatywa() > losowanie(1, 10)) {
            System.out.println(getTypPostaci() + " wykonal unik.");
            return;
        }

        if (czySaObrazeniaDlaOfiary(uderzenie)) {
            przyjecieObrazenUderzenia(uderzenie);
        } else {
            System.out.println(getTypPostaci() + " otrzymal cios, lecz nie doznal obrazen.");
        }

    }

    private void przyjecieObrazenUderzenia(WynikUderzenia uderzenie) {
        int obrazenia = uderzenie.getPotencjalneObrazenia() - ochronaCzesciCiala(uderzenie.getTrafioneMiejsce()) - getWytrzymalosc();
        if (obrazenia < getPunktyZycia()) {
            setPunktyZycia(getPunktyZycia() - obrazenia);
        } else {
            setPunktyZycia(0);
        }
        System.out.println(getTypPostaci().name() + " traci " + obrazenia + " punktow zycia. Pozostalo mu " + getPunktyZycia() + "p. zycia.");
        if (getPunktyZycia() <= 0) {
            System.out.println(getTypPostaci() + " nie zyje.");
        }
    }

    private boolean czySaObrazeniaDlaOfiary(WynikUderzenia uderzenie) {
        return getWytrzymalosc() + ochronaCzesciCiala(uderzenie.getTrafioneMiejsce()) < uderzenie.getPotencjalneObrazenia();
    }

    private int losowanie(int min, int max) {
        return TworzeniePostaciService.losuj(min, max);
    }
}
