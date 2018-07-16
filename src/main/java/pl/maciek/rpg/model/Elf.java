package pl.maciek.rpg.model;

import org.assertj.core.util.Lists;
import service.TworzeniePostaciService;

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
                Lists.newArrayList(TypPancerza.NAGOLENNNIKI, TypPancerza.ZBROJA));
    }
}
