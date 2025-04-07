package ejemplosjava;

import java.util.Scanner;

public class ComprobadorParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = entrada.nextInt();

        String resultado = comprobarParImpar(numero);
        System.out.println(resultado);
       
    }

    public static String comprobarParImpar(int num) {
        if (num % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }
}