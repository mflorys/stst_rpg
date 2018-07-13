package pl.maciek.rpg.model;

public abstract class Istota {

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

    public Istota(TypPostaci typPostaci){
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
}
