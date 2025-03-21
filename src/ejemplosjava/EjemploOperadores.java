package ejemplosjava;

public class EjemploOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Aritmético: a + b = " + (a + b));
        System.out.println("Relacional: a > b = " + (a > b));
        System.out.println("Lógico: (a > 0) && (b < 10) = " + ((a > 0) && (b < 10)));
        System.out.println("Bit a bit AND: a & b = " + (a & b)); // Binario: 1010 & 0101 = 0000
        System.out.println("Ternario: a > b ? 'a es mayor' : 'b es mayor' = " + (a > b ? "a es mayor" : "b es mayor"));
     
    }
}