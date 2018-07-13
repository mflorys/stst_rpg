package service;

import pl.maciek.rpg.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TworzeniePostaciService {

    public static int losuj(int min, int max) {
        Random rn = new Random();
        return rn.nextInt(max - min + 1) + min;
    }

    public List<Istota> stworzPostac(int liczbaPostaci) {


        List<Istota> postacie = new ArrayList<>();
        List<TypPostaci> tp = new ArrayList<>(Arrays.asList(TypPostaci.values()));

        for (int i = 0; i < liczbaPostaci; i++) {

            int temp = TworzeniePostaciService.losuj(0, tp.size() - 1);
            TypPostaci kto = tp.get(temp);
            switch (kto) {
                case CZLOWIEK:
                    postacie.add(new Czlowiek());
                    break;
                case ELF:
                    postacie.add(new Elf());
                    break;
                case HALFING:
                    postacie.add(new Halfing());
                    break;
                case KRASNOLUD:
                    postacie.add(new Krasnolud());
                    break;
                case ORK:
                    postacie.add(new Ork());
                    break;
                case TROLL:
                    postacie.add(new Troll());
                    break;
                default:
                    return null;
            }
        }
        return postacie;
    }
}
