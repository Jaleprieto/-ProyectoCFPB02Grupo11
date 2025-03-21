public class FactorialRecursivo {
    public static void main(String[] args) {
        int n = 5;
        long factorial = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public static long calcularFactorial(int num) {
        if (num == 0) { // Caso base
            return 1;
        } else { // Paso recursivo
            return num * calcularFactorial(num - 1);
        }
    }
}