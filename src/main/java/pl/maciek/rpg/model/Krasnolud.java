package pl.maciek.rpg.model;

import service.TworzeniePostaciService;

import java.util.Arrays;

public class Krasnolud extends Istota {
    public Krasnolud() {
        super(TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TypPostaci.KRASNOLUD,
                TypBroni.TOPOR,
                Arrays.asList(TypPancerza.TARCZA, TypPancerza.ZBROJA));
    }
}
