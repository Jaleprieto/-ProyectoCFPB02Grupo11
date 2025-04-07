/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosescenario2;
import java.util.Scanner;

public class GastosMensuales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGastos = 0.0; // Acumulador especial para sumar gastos
        int dias = 5; // Una semana como ejemplo

        System.out.println("Registro de gastos diarios:");
        for (int dia = 1; dia <= dias; dia++) {
            System.out.print("Gasto del día " + dia + ": $");
            double gasto = scanner.nextDouble();
            totalGastos += gasto; // Acumulador suma cada gasto válido
            System.out.println(totalGastos);
        }

        System.out.printf("Total de gastos en %d días: $%.2f%n", dias, totalGastos);
        scanner.close();
    }
}