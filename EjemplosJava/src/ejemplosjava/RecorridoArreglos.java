package ejemplosjava;

public class RecorridoArreglos {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Usando bucle for-each para arreglo 1D:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println("\nUsando bucle for-each para arreglo 2D:");
        for (int[] fila : matriz) { // bucle for-each para filas
            for (int elemento : fila) { // Bucle for-each anidado para elementos en cada fila
                System.out.println(elemento);
            }
        }
    }
}