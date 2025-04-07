package ejemplosjava;

import java.util.Arrays;

public class UtilidadesArreglos {
    public static void main(String[] args) {
        int[] arreglo1 = {5, 2, 8, 1, 9};
        int[] arreglo2 = {5, 2, 8, 1, 9};
        int[] arreglo3 = new int[5];

        System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));

        Arrays.sort(arreglo1);
        System.out.println("Arreglo 1 Ordenado: " + Arrays.toString(arreglo1));

        System.out.println("Arreglo 1 es igual a Arreglo 2: " + Arrays.equals(arreglo1, arreglo2)); // Ahora es falso

        System.arraycopy(arreglo1, 0, arreglo3, 0, arreglo1.length); // Copiar arreglo1 a arreglo3
        System.out.println("Arreglo 3 (copiado de Arreglo 1): " + Arrays.toString(arreglo3));
        System.out.println("Arreglo 1 es igual a Arreglo 3: " + Arrays.equals(arreglo1, arreglo3)); // Ahora es verdadero
    }
}