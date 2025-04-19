package com.javaexamples.ch7;

/* La clase PaqueteDeCartas representa un paquete de cartas de juego. */

import java.util.Random;

public class PaqueteDeCartas {
    private Carta[] paquete; // arreglo de objetos Carta
    private int cartaActual; // índice de la siguiente Carta a repartir (0 a 51)
    private static final int NUMERO_DE_CARTAS = 52; // número constante de Cartas

    // generador de números aleatorios
    private static final Random numerosAleatorios = new Random();

    public PaqueteDeCartas() {
        String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joto", "Reina", "Rey"};
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Espadas"};

        Carta[] paquete = new Carta[NUMERO_DE_CARTAS]; // crea arreglo de objetos Carta
        cartaActual = 0; // establece CartaActual de modo que la primera Carta repartida sea paquete[0]

        // llena el paquete con objetos Carta
        for (int i = 0 ; i < paquete.length ; i++) {
            paquete[i] = new Carta(caras[i % 13], palos[i / 13]);
        }
    }

    // Baraja el paquete de Cartas con un algoritmo de una pasada
    public void brajar() {
        // después de barajar, la repartición debe comenzar en paquete[0] otra vez
        cartaActual = 0;
        
        // para cada Carta, selecciona otra Carta aleatoria (0 a 51) y las intercambia
        for (int primera = 0 ; primera < paquete.length ; primera++) {
            // selecciona un número aleatorio entre 0 y 51
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            // intercambia Carta actual con Carta seleccionada al azar
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }

    // reparte una Carta
    public Carta repartirCarta() {
        // determina si quedan Cartas por repartir
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++]; // devuelve la Carta actual en el arreglo
        } else {
            return null; // devuelve null para indicar que se repartieron todas las Cartas
        }
    }
}
