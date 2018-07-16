package pl.maciek.rpg.model;

import org.assertj.core.util.Lists;
import service.TworzeniePostaciService;

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
                Lists.newArrayList(TypPancerza.REKAWICE, TypPancerza.ZBROJA));
    }
}
