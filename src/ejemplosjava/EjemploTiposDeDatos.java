package ejemplosjava;

public class EjemploTiposDeDatos {
    public static void main(String[] args) {
        byte varByte;
        varByte = 100;
        short varShort = 30000;
        int varInt = 1000000;

        System.out.println("Byte: " + varByte + ", Tamaño: " + Byte.SIZE);
        System.out.println("Short: " + varShort + ", Tamaño: " + Short.SIZE);
        System.out.println("Int: " + varInt + ", Tamaño: " + Integer.SIZE);
        // ... (Continúa para otros tipos de datos)
    }
}