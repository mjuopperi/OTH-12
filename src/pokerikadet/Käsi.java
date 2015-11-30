package pokerikadet;

import java.util.*;

public class Käsi implements Arvioitava {

    // Näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista esim. Käsi.SUORA
    final static int EIVÄRI = 0, EISUORA = 0, SUORA = 1, VÄRI = 2, VÄRISUORA = 3;
    // Esittele instanssimuuttujat
    private Kortti[] käsi = new Kortti[5];

    // Kirjoita konstruktori, joka saa parametrina Pakka-olion
    public Käsi(Pakka pakka) {
        for (int i = 0; i < käsi.length; i++) {
            käsi[i] = pakka.annaKortti();
        }
    }

    public Käsi(Kortti[] pakka) {
        for (int i = 0; i < käsi.length; i++) {
            käsi[i] = pakka[i];
        }
    }

    // Kirjoita toteutus rajapinnassa esitellylle metodille
    public int annaArvo() {
        boolean onkoVari, onkoSuora;
        onkoVari = onVari();
        onkoSuora = onSuora();
        if (onkoVari && onkoSuora) {
            return 3;
        } else if (onkoVari) {
            return 2;
        } else if (onkoSuora) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean onVari() {

        int testiMaa = käsi[0].getMaa();
        for (int i = 1; i < käsi.length; i++) {
            if (käsi[i].getMaa() != testiMaa) {
                return false;
            }
        }
        return true;
    }

    private boolean onSuora() {

        Arrays.sort(käsi);
        if (käsi[0].getArvo() + 4 == käsi[4].getArvo()) {
            for (int i = 1; i < käsi.length-1; i++) {
            if (käsi[i].getArvo() == käsi[i+1].getArvo()) {
                return false;
            } 
           // return true;
            }
            return true;
        } else if (käsi[0].getArvo() == 1) {
            boolean b = (käsi[1].getArvo() == 10 && käsi[2].getArvo() == 11
                    && käsi[3].getArvo() == 12 && käsi[4].getArvo() == 13);

            return (b);
        } else {
            return false;
        }
    }
    // Kirjoita toString()

    @Override
    public String toString() {
        String tulos = "" + käsi[0];
        for (int i = 1; i < käsi.length; i++) {
            tulos = tulos + ", " + käsi[i];
        }
        return tulos;
    }
}
