package ejemplosjava;

public class EjemploMetodo {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        int numMax = encontrarMaximo(num1, num2); // Invocación del método
        System.out.println("El número máximo es: " + numMax);

        imprimirSaludo("Alicia"); // Invocación de método void
    }

    public static int encontrarMaximo(int a, int b) { // Definición del método
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void imprimirSaludo(String nombre) { // Definición de método void
        System.out.println("¡Hola, " + nombre + "!");
    }
}