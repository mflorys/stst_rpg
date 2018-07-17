package pl.maciek.rpg.model;

public enum CzesciCiala {
    GLOWA(0, 14),
    KORPUS(55, 74),
    REKA_LEWA(35,54),
    REKA_PRAWA(15, 34),
    NOGA_LEWA(75, 84),
    NOGA_PRAWA(85, 99);

    int minWartoscTrafienia;
    int maxWartoscTrafienia;

    CzesciCiala(int minWartoscTrafienia, int maxWartoscTrafienia){
        this.minWartoscTrafienia = minWartoscTrafienia;
        this.maxWartoscTrafienia = maxWartoscTrafienia;
    }
}
