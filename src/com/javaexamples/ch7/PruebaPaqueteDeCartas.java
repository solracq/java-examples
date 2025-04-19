package com.javaexamples.ch7;

public class PruebaPaqueteDeCartas {
    public static void main(String[] args) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.brajar(); // baraja el paquete de cartas

        // imprime todas las 52 cartas en el orden en que se reparten
        for(int i = 0; i <= 52 ; i++) {
            System.out.printf("%-19s", miPaqueteDeCartas.repartirCarta());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
    
}
