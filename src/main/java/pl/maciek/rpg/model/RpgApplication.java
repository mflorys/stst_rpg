package pl.maciek.rpg.model;

import service.TworzeniePostaciService;
import service.WalkaService;

import java.util.List;

public class RpgApplication {

    public static void main(String[] args) {


        TworzeniePostaciService postac = new TworzeniePostaciService();
        List<Istota> istota = postac.stworzPostac(2);

        System.out.println(istota.toString());
        istota.get(0).losujTrafioneMiejsce();
        WalkaService.walka(istota.get(0), istota.get(1));

    }
}
