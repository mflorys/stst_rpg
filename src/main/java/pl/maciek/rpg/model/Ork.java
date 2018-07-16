package pl.maciek.rpg.model;

import org.assertj.core.util.Lists;
import service.TworzeniePostaciService;

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
                Lists.newArrayList(TypPancerza.ZBROJA));
    }
}
