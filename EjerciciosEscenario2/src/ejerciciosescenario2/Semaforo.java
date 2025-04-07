/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosescenario2;
import java.util.Scanner; // Importamos la clase Scanner

public class Semaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos el objeto Scanner
        String entrada; // Variable para almacenar la entrada del usuario

        // Bucle do-while para mantener el programa ejecutándose
        do {
            // Solicitamos la entrada al usuario
            System.out.println("Ingrese la letra inicial del color del semáforo (R, A, V) o 'S' para salir: ");
            entrada = scanner.nextLine().toUpperCase(); // Leemos la entrada y la convertimos a mayúsculas

            // Verificamos si no es la opción de salida
            if (!entrada.equals("S")) {
                // Usamos switch para validar y clasificar la entrada
                switch (entrada) {
                    case "R" -> System.out.println("Deténgase.");
                    case "A" -> System.out.println("Prepárese.");
                    case "V" -> System.out.println("Avance.");
                    default -> System.out.println("Color no válido. Use R (Rojo), A (Amarillo) o V (Verde).");
                }
            }
        } while (!entrada.equals("S")); // Continúa hasta que la entrada sea "S"

        // Mensaje al salir
        System.out.println("Programa finalizado.");
        scanner.close(); // Cerramos el Scanner
    }
}