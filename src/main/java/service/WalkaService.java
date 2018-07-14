package service;

import pl.maciek.rpg.model.Istota;

public class WalkaService {
    public static void walka(Istota atakujacy, Istota ofiara) {

        System.out.println("Rozpoczyna sie walka, w ktorej atakujacym jest " + atakujacy.getTypPostaci() + " a broni sie " + ofiara.getTypPostaci());

        while(atakujacy.getPunktyZycia() > 0 && ofiara.getPunktyZycia()>0){
            Istota temp = null;
            int cios = atakujacy.atak(ofiara);
            if (cios > 0) ofiara.unik(cios, atakujacy);

            temp = atakujacy;
            atakujacy = ofiara;
            ofiara = temp;
        }
    }
}

