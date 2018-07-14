package pl.maciek.rpg.model;

import interfaces.FunkcjeIstoty;
import service.TworzeniePostaciService;
import service.WalkaService;

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

    public Istota(Integer sila, Integer inicjatywa, Integer iloscAtakow, Integer szybkosc, Integer iloscUnikow, Integer wytrzymalosc, Integer punktyZycia, Integer zrecznosc, TypPostaci typPostaci) {
        this.sila = sila;
        this.inicjatywa = inicjatywa;
        this.iloscAtakow = iloscAtakow;
        this.szybkosc = szybkosc;
        this.iloscUnikow = iloscUnikow;
        this.wytrzymalosc = wytrzymalosc;
        this.punktyZycia = punktyZycia;
        this.zrecznosc = zrecznosc;
        this.typPostaci = typPostaci;
    }

    public Istota(TypPostaci typPostaci) {
        this.typPostaci = typPostaci;
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
                "}";
    }

    @Override
    public int atak(Istota ofiara) {
        int potencjalneObrazenia = sila + TworzeniePostaciService.losuj(0, 3);
        if (zrecznosc > TworzeniePostaciService.losuj(1, 10)) {
            System.out.println(typPostaci.name() + " zadal cios.");
            return potencjalneObrazenia;
        } else {
            System.out.println(typPostaci.name() + " chybil.");
            return 0;
        }
    }

    @Override
    public void unik(int potencjalneObrazenia, Istota atakujacy) {
        if (inicjatywa < TworzeniePostaciService.losuj(1, 10)) {
            if (wytrzymalosc < potencjalneObrazenia) {
                int silaAtaku = potencjalneObrazenia - wytrzymalosc;
                System.out.println(typPostaci.name() + " traci " + silaAtaku + " punktow zycia.");
                punktyZycia -= silaAtaku;
            } else System.out.println(this.getTypPostaci() + " nie doznal obrazen.");
            if (punktyZycia <= 0) {
                System.out.println(this.getTypPostaci() + " nie zyje.");
            } else {
            }
        } else {
            System.out.println(this.getTypPostaci() + " wykonal unik.");
        }
    }
}
