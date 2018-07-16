package pl.maciek.rpg.model;

import org.assertj.core.util.Lists;
import service.TworzeniePostaciService;

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
                Lists.newArrayList(TypPancerza.TARCZA, TypPancerza.ZBROJA));
    }
}
