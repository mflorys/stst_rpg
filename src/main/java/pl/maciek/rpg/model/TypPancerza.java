package pl.maciek.rpg.model;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public enum TypPancerza {
    HELM(1, ImmutableSet.of(CzesciCiala.GLOWA)),
    ZBROJA(1, ImmutableSet.of(CzesciCiala.KORPUS)),
    REKAWICE(1, ImmutableSet.of(CzesciCiala.REKA_LEWA, CzesciCiala.REKA_PRAWA)),
    NAGOLENNNIKI(1, ImmutableSet.of(CzesciCiala.NOGA_LEWA, CzesciCiala.NOGA_PRAWA)),
    TARCZA(1, ImmutableSet.of(CzesciCiala.GLOWA, CzesciCiala.KORPUS, CzesciCiala.REKA_PRAWA, CzesciCiala.REKA_LEWA, CzesciCiala.NOGA_PRAWA, CzesciCiala.NOGA_LEWA));

    int punktyObrony;
    Set chronioneCzesciCiala;

    TypPancerza(int punktyObrony, Set chronioneCzesciCiala) {
        this.punktyObrony = punktyObrony;
        this.chronioneCzesciCiala = chronioneCzesciCiala;
    }
}
