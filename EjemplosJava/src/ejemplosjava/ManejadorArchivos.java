/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosjava;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManejadorArchivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MANEJO DE ARCHIVOS ---");
            System.out.println("1. Crear un archivo de texto");
            System.out.println("2. Leer un archivo de texto");
            System.out.println("3. Añadir texto a un archivo existente");
            System.out.println("4. Listar archivos de un directorio");
            System.out.println("5. Eliminar un archivo");
            System.out.println("6. Comprobar si un archivo existe");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1 -> crearArchivo(scanner);
                case 2 -> leerArchivo(scanner);
                case 3 -> añadirTextoArchivo(scanner);
                case 4 -> listarArchivosDirectorio(scanner);
                case 5 -> eliminarArchivo(scanner);
                case 6 -> comprobarExistenciaArchivo(scanner);
                case 0 -> System.out.println("Saliendo del gestor de archivos...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void crearArchivo(Scanner scanner) {
        System.out.print("Introduce la ruta del archivo a crear: ");
        String ruta = scanner.nextLine();
        System.out.print("Introduce el contenido a escribir: ");
        String contenido = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write(contenido);
            System.out.println("Archivo creado correctamente en: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
    
    private static void leerArchivo(Scanner scanner) {
        System.out.print("Introduce la ruta del archivo a leer: ");
        String ruta = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            System.out.println("\nContenido del archivo:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    private static void añadirTextoArchivo(Scanner scanner) {
        System.out.print("Introduce la ruta del archivo existente: ");
        String ruta = scanner.nextLine();
        System.out.print("Introduce el texto a añadir: ");
        String contenido = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true))) {
            writer.newLine(); // Añadir salto de línea
            writer.write(contenido);
            System.out.println("Texto añadido correctamente al archivo: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al añadir texto al archivo: " + e.getMessage());
        }
    }
    
    private static void listarArchivosDirectorio(Scanner scanner) {
        System.out.print("Introduce la ruta del directorio: ");
        String rutaDirectorio = scanner.nextLine();
        
        File directorio = new File(rutaDirectorio);
        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            System.out.println("\nArchivos en el directorio " + rutaDirectorio + ":");
            if (archivos != null && archivos.length > 0) {
                for (File archivo : archivos) {
                    System.out.println(archivo.getName() + 
                                      (archivo.isDirectory() ? " (Directorio)" : " (Archivo)") + 
                                      " - " + (archivo.length() / 1024) + " KB");
                }
            } else {
                System.out.println("El directorio está vacío.");
            }
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
    }
    
    private static void eliminarArchivo(Scanner scanner) {
        System.out.print("Introduce la ruta del archivo a eliminar: ");
        String ruta = scanner.nextLine();
        
        File archivo = new File(ruta);
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Archivo eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
    
    private static void comprobarExistenciaArchivo(Scanner scanner) {
        System.out.print("Introduce la ruta del archivo a comprobar: ");
        String ruta = scanner.nextLine();
        
        File archivo = new File(ruta);
        if (archivo.exists()) {
            System.out.println("El archivo existe.");
            System.out.println("Tamaño: " + (archivo.length() / 1024) + " KB");
            System.out.println("Última modificación: " + new java.util.Date(archivo.lastModified()));
            System.out.println("¿Se puede leer?: " + archivo.canRead());
            System.out.println("¿Se puede escribir?: " + archivo.canWrite());
            System.out.println("¿Es un directorio?: " + archivo.isDirectory());
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}