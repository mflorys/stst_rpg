package pl.maciek.rpg.model;

import service.TworzeniePostaciService;

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
                TypPostaci.CZLOWIEK);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
