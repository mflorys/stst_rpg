package pl.maciek.rpg.model;

import service.TworzeniePostaciService;

import java.util.List;

public class RpgApplication {

    public static void main(String[] args) {


        TworzeniePostaciService postac = new TworzeniePostaciService();
        List<Istota> istota = postac.stworzPostac(30);

        System.out.println(istota.toString());
    }
}
