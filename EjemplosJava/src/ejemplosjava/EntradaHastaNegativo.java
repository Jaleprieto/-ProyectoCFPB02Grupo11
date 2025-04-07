package ejemplosjava;

import java.util.Scanner;

public class EntradaHastaNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduce números positivos (número negativo para detener):");

        numero = entrada.nextInt(); // Lectura inicial
        while (numero >= 0) {
            System.out.println("Has introducido: " + numero);
            numero = entrada.nextInt(); // Lectura para la siguiente iteración
        }
        System.out.println("Bucle detenido porque has introducido un número negativo.");
     
    }
}