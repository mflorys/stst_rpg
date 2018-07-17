package pl.maciek.rpg.model;

import service.TworzeniePostaciService;

import java.util.Arrays;

public class Ork extends Istota {
    public Ork() {
        super(TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TypPostaci.ORK,
                TypBroni.MACZUGA,
                Arrays.asList(TypPancerza.ZBROJA));
    }
}
