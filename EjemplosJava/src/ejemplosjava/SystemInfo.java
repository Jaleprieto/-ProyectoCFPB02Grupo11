package ejemplosjava;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SystemInfo {
    public static void main(String[] args) {
        // 1. Tipo de Sistema Operativo
        String osName = System.getProperty("os.name");
        System.out.println("Sistema Operativo: " + osName);

        // 2. Hora Actual
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Hora Actual: " + formattedDate);

        // 3. Espacio Ocupado en Disco
        File root = new File("/");
        long totalSpace = root.getTotalSpace();
        long freeSpace = root.getFreeSpace();
        long usedSpace = totalSpace - freeSpace;
        System.out.println("Espacio Ocupado en Disco: " + (usedSpace / (1024 * 1024 * 1024)) + " GB");

        // 4. Cantidad de Memoria RAM
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println("Memoria RAM Usada por JVM: " + (usedMemory / (1024 * 1024)) + " MB");

        // Intentar obtener la memoria RAM total del sistema (solo en Linux)
        try {
            Process process = Runtime.getRuntime().exec("cat /proc/meminfo");
            Scanner scanner = new Scanner(process.getInputStream()).useDelimiter("\\A");
            String memInfo = scanner.hasNext() ? scanner.next() : "";
            String[] lines = memInfo.split("\n");
            for (String line : lines) {
                if (line.startsWith("MemTotal:")) {
                    String[] parts = line.split("\\s+");
                    long totalRam = Long.parseLong(parts[1]) / 1024; // Convertir a MB
                    System.out.println("Memoria RAM Total: " + totalRam + " MB");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo obtener la memoria RAM total del sistema.");
        }
    }
}