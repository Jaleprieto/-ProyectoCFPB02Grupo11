package ejemplosjava;

import java.util.Scanner;

public class EjemplosJava {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\n--- MENÚ DE EJEMPLOS JAVA ---");
                System.out.println("1. Contar del 1 al 5");
                System.out.println("2. Comprobar nota");
                System.out.println("3. Comprobar par/impar");
                System.out.println("4. Mostrar día de la semana");
                System.out.println("5. Ejemplo de arreglos");
                System.out.println("6. Encontrar máximo y saludar");
                System.out.println("7. Ejemplo de operadores");
                System.out.println("8. Tipos de datos");
                System.out.println("9. Entrada hasta negativo");
                System.out.println("10. Gestor de tareas (avanzado)");
                System.out.println("0. Salir");
                System.out.print("Selecciona una opción: ");
                
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1 -> BucleContadorFor.main(args);
                    case 2 -> ComprobadorDeNotas.main(args);
                    case 3 -> ComprobadorParImpar.main(args);
                    case 4 -> DiaDeLaSemana.main(args);
                    case 5 -> EjemploArreglo.main(args);
                    case 6 -> EjemploMetodo.main(args);
                    case 7 -> EjemploOperadores.main(args);
                    case 8 -> EjemploTiposDeDatos.main(args);
                    case 9 -> EntradaHastaNegativo.main(args);
                    case 10 -> GestorTareas.main(args);
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }
            } while (opcion != 0);
        }
    }
}
