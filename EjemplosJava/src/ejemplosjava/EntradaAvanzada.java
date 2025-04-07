/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosjava;


import java.util.Scanner;
import java.util.InputMismatchException;

public class EntradaAvanzada {
    public static void main(String[] args) {
        // Ejemplo 1: Entrada básica con validación
        try (Scanner scanner = new Scanner(System.in)) {
            // Ejemplo 1: Entrada básica con validación
            int edad = obtenerEnteroValido(scanner, "Introduce tu edad: ", 0, 120);
            System.out.println("Tu edad es: " + edad);
            
            // Ejemplo 2: Entrada de texto con restricciones
            String nombre = obtenerTextoNoVacio(scanner, "Introduce tu nombre: ");
            System.out.println("Hola, " + nombre + "!");
            
            // Ejemplo 3: Entrada de opción múltiple
            String[] opciones = {"Java", "Python", "C++", "JavaScript"};
            int opcion = obtenerOpcionMenu(scanner, "Elige tu lenguaje de programación favorito:", opciones);
            System.out.println("Has elegido: " + opciones[opcion - 1]);
            
            // Ejemplo 4: Leer hasta una palabra clave
            System.out.println("\nEscribe un mensaje (escribe 'fin' para terminar):");
            String mensaje = leerHastaPalabraClave(scanner, "fin");
            System.out.println("\nMensaje completo:");
            System.out.println(mensaje);
            
            // Ejemplo 5: Leer formato específico (fecha)
            String fecha = obtenerFormatoEspecifico(scanner,
                    "Introduce una fecha (dd/mm/aaaa): ",
                    "\\d{2}/\\d{2}/\\d{4}");
            System.out.println("Fecha introducida: " + fecha);
        }
    }
    
    /**
     * Solicita y valida un número entero dentro de un rango específico
     */
    public static int obtenerEnteroValido(Scanner scanner, String mensaje, int min, int max) {
        int valor = 0;
        boolean entradaValida = false;
        
        do {
            try {
                System.out.print(mensaje);
                valor = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                if (valor >= min && valor <= max) {
                    entradaValida = true;
                } else {
                    System.out.println("Error: El valor debe estar entre " + min + " y " + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                scanner.nextLine(); // Limpiar buffer
            }
        } while (!entradaValida);
        
        return valor;
    }
    
    /**
     * Solicita un texto y asegura que no esté vacío
     */
    public static String obtenerTextoNoVacio(Scanner scanner, String mensaje) {
        String texto;
        
        do {
            System.out.print(mensaje);
            texto = scanner.nextLine().trim();
            
            if (texto.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío.");
            }
        } while (texto.isEmpty());
        
        return texto;
    }
    
    /**
     * Muestra un menú de opciones y solicita elegir una
     */
    public static int obtenerOpcionMenu(Scanner scanner, String titulo, String[] opciones) {
        int seleccion = 0;
        
        do {
            System.out.println("\n" + titulo);
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            System.out.print("Tu elección (1-" + opciones.length + "): ");
            
            try {
                seleccion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                if (seleccion < 1 || seleccion > opciones.length) {
                    System.out.println("Error: Selecciona una opción válida.");
                    seleccion = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número.");
                scanner.nextLine(); // Limpiar buffer
            }
        } while (seleccion < 1);
        
        return seleccion;
    }
    
    /**
     * Lee líneas de texto hasta encontrar una palabra clave
     */
    public static String leerHastaPalabraClave(Scanner scanner, String palabraClave) {
        StringBuilder mensaje = new StringBuilder();
        String linea;
        
        while (true) {
            linea = scanner.nextLine();
            
            if (linea.equalsIgnoreCase(palabraClave)) {
                break;
            }
            
            mensaje.append(linea).append("\n");
        }
        
        return mensaje.toString();
    }
    
    /**
     * Solicita texto que cumpla con un formato específico (expresión regular)
     */
    public static String obtenerFormatoEspecifico(Scanner scanner, String mensaje, String patron) {
        String texto;
        boolean formatoValido = false;
        
        do {
            System.out.print(mensaje);
            texto = scanner.nextLine().trim();
            
            if (texto.matches(patron)) {
                formatoValido = true;
            } else {
                System.out.println("Error: El formato introducido no es válido.");
            }
        } while (!formatoValido);
        
        return texto;
    }
}