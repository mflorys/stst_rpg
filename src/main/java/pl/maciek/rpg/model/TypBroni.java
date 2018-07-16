package pl.maciek.rpg.model;

public enum TypBroni {
    PIESC(0, 2),
    MIECZ(2, 5),
    LUK(2, 5),
    KUSZA(3, 6),
    TOPOR(2, 5),
    MACZUGA(2, 5),
    MLOT(3, 5);

    int obrazeniaMin;
    int obrazeniaMax;

    TypBroni(int obrazeniaMin, int obrazeniaMax){
        this.obrazeniaMin = obrazeniaMin;
        this.obrazeniaMax = obrazeniaMax;
    }
}
