package pl.maciek.rpg.model;

import service.TworzeniePostaciService;

import java.util.Arrays;

public class Halfing extends Istota {
    public Halfing(){
        super(TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TypPostaci.HALFING,
                TypBroni.KUSZA,
                Arrays.asList(TypPancerza.REKAWICE, TypPancerza.ZBROJA));
    }
}
