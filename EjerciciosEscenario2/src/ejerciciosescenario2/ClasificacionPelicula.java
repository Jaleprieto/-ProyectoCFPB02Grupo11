/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosescenario2;

import java.util.Scanner; // Importamos la clase Scanner para leer entrada del usuario

public class ClasificacionPelicula {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitamos la edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Leemos la edad ingresada como entero

        // Estructura de decisión para clasificar
        if (edad >= 18) {
            System.out.println("Puede ver películas clasificadas para mayores de 18.");
        } else if (edad >= 13) {
            System.out.println("Puede ver películas clasificadas PG-13.");
        } else {
            System.out.println("Solo puede ver películas clasificadas para todas las edades.");
        }

        // Cerramos el Scanner para liberar recursos
        scanner.close();
    }
}