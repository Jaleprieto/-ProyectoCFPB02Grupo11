/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosescenario2;

import java.util.Scanner; // Importamos la clase Scanner

public class ClasificacionPeliculaV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos el objeto Scanner
        int edad; // Declaramos la variable edad

        // Bucle do-while
        do {
            // Solicitamos la edad al usuario
            System.out.println("Ingrese su edad (o 0 para salir): ");
            edad = scanner.nextInt(); // Leemos la edad ingresada

            // Estructura de decisión para clasificar (solo si no es 0)
            if (edad != 0) {
                if (edad >= 18) {
                    System.out.println("Puede ver películas clasificadas para mayores de 18.");
                } else if (edad >= 13) {
                    System.out.println("Puede ver películas clasificadas PG-13.");
                } else {
                    System.out.println("Solo puede ver películas clasificadas para todas las edades.");
                }
            }
        } while (edad != 0); // Continúa mientras edad no sea 0

        // Mensaje al salir
        System.out.println("Programa finalizado.");
        scanner.close(); // Cerramos el Scanner
    }
}