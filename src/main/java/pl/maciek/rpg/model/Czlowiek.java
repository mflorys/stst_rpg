package pl.maciek.rpg.model;

import service.TworzeniePostaciService;

import java.util.Arrays;

public class Czlowiek extends Istota {

    public Czlowiek() {
        super(TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TypPostaci.CZLOWIEK,
                TypBroni.MIECZ,
                Arrays.asList(TypPancerza.ZBROJA, TypPancerza.HELM));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
