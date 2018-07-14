package interfaces;

import pl.maciek.rpg.model.Istota;

public interface FunkcjeIstoty {
    int atak(Istota ofiara);
    void unik(int potencjalneObrazenia, Istota atakujacy);
}
