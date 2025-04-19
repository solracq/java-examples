package com.javaexamples.ch7;

/* La clase Carta representa una carta de juego/. */

public class Carta {
    private String cara; // cara de la carta ("As", "Dos", ...)
    private String palo; // palo de la carta ("Corazones", "Diamantes", ...)

    public Carta(String caraCarta, String paloCarta) {
        cara = caraCarta;
        palo = paloCarta;
    }

    public String toString() {
        return cara + " de " + palo;
    }
}
