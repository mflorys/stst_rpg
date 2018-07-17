package pl.maciek.rpg.model;

public class WynikUderzenia {
    public CzesciCiala trafioneMiejsce;
    public int potencjalneObrazenia;

    public CzesciCiala getTrafioneMiejsce() {
        return trafioneMiejsce;
    }

    public void setTrafioneMiejsce(CzesciCiala trafioneMiejsce) {
        this.trafioneMiejsce = trafioneMiejsce;
    }

    public int getPotencjalneObrazenia() {
        return potencjalneObrazenia;
    }

    public void setPotencjalneObrazenia(int potencjalneObrazenia) {
        this.potencjalneObrazenia = potencjalneObrazenia;
    }
}
