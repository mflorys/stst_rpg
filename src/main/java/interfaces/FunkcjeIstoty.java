package interfaces;

import pl.maciek.rpg.model.Istota;
import pl.maciek.rpg.model.WynikUderzenia;

public interface FunkcjeIstoty {
    WynikUderzenia atak(Istota ofiara);
    void unik(WynikUderzenia uderzenie);
}
