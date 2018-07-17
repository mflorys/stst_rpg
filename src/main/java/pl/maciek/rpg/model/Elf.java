package pl.maciek.rpg.model;

import service.TworzeniePostaciService;

import java.util.Arrays;

public class Elf extends Istota {
    public Elf() {
        super(TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TworzeniePostaciService.losuj(1, 6),
                TypPostaci.ELF,
                TypBroni.LUK,
                Arrays.asList(TypPancerza.NAGOLENNNIKI, TypPancerza.ZBROJA));
    }
}
