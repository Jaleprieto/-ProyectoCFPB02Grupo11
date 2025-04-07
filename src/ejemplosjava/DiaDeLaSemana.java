package ejemplosjava;

import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número del día (1-7): ");
        int numeroDia = entrada.nextInt();

        String nombreDia;
        switch (numeroDia) {
            case 1: nombreDia = "Monday"; break;
            case 2: nombreDia = "tuesday"; break;
            case 3: nombreDia = "wednesday"; break;
            case 4: nombreDia = "thursday"; break;
            case 5: nombreDia = "friday"; break;
            case 6: nombreDia = "saturday"; break;
            case 7: nombreDia = "Domingo"; break;
            default: nombreDia = "Número de día no válido"; break; // Caso por defecto
        }
        System.out.println("Nombre del día: " + nombreDia);
     
    }
}