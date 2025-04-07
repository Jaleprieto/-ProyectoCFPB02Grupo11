package ejemplosjava;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Introduce tu opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Consume el carácter de nueva línea

            switch (opcion) {
                case 1: System.out.println("Has seleccionado la Opción 1."); break;
                case 2: System.out.println("Has seleccionado la Opción 2."); break;
                case 3: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
            }
        } while (opcion != 3); // Bucle hasta que el usuario elija salir

        entrada.close();
    }
}