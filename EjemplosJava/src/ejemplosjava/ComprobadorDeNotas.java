package ejemplosjava;

import java.util.Scanner;

public class ComprobadorDeNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu puntuación (0-100): ");
        int puntuacion = entrada.nextInt();

        String nota;
        if (puntuacion >= 90) {
            nota = "A";
        } else if (puntuacion >= 80) {
            nota = "B";
        } else if (puntuacion >= 70) {
            nota = "C";
        } else if (puntuacion >= 60) {
            nota = "D";
        } else {
            nota = "F";
        }
        System.out.println("Tu nota es: " + nota);
        
    }
}