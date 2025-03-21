package ejemplosjava;

public class EjemploArreglo {
    public static void main(String[] args) {
        // Arreglo 1D
        int[] numeros = new int[5]; // Declarar e inicializar un arreglo de 5 enteros
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Elementos del Arreglo 1D:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // Arreglo 2D (matriz)
        int[][] matriz = new int[3][2]; // 3 filas, 2 columnas
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        System.out.println("\nElementos del Arreglo 2D (Matriz):");
        for (int i = 0; i < matriz.length; i++) { // Iterar a través de las filas
            for (int j = 0; j < matriz[i].length; j++) { // Iterar a través de las columnas
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}