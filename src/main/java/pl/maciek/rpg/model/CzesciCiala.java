package pl.maciek.rpg.model;

public enum CzesciCiala {
    GLOWA(0, 14),
    LEWA_REKA(35,54),
    LEWA_NOGA(75, 84),
    KORPUS(55, 74),
    PRAWA_REKA(15, 34),
    PRAWA_NOGA(85, 99);

    private int minWartoscTrafienia;
    private int maxWartoscTrafienia;

    CzesciCiala(int minWartoscTrafienia, int maxWartoscTrafienia){
        this.minWartoscTrafienia = minWartoscTrafienia;
        this.maxWartoscTrafienia = maxWartoscTrafienia;
    }
}
