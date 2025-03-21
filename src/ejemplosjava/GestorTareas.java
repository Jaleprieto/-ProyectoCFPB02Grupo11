package ejemplosjava;

import java.util.Scanner;

public class GestorTareas {
    private final String[] tareas = new String[100];
    private int numTareas = 0;

    public void añadirTarea(String tarea) {
        if (numTareas < tareas.length) {
            tareas[numTareas++] = tarea;
            System.out.println("Tarea '" + tarea + "' añadida.");
        } else {
            System.out.println("Error: Lista de tareas llena.");
        }
    }

    public void listarTareas() {
        if (numTareas == 0) {
            System.out.println("No hay tareas en la lista.");
            return;
        }
        System.out.println("\nLista de Tareas:");
        for (int i = 0; i < numTareas; i++) {
            System.out.println((i + 1) + ". " + tareas[i]);
        }
    }

    public void eliminarTarea(int posicion) {
        if (posicion < 1 || posicion > numTareas) {
            System.out.println("Error: Posición no válida.");
            return;
        }

        // Desplazar tareas hacia la izquierda
        for (int i = posicion - 1; i < numTareas - 1; i++) {
            tareas[i] = tareas[i + 1];
        }
        tareas[numTareas - 1] = null; // Eliminar referencia
        numTareas--;
        System.out.println("Tarea en posición " + posicion + " eliminada.");
    }

    public void modificarTarea(int posicion, String nuevaTarea) {
        if (posicion < 1 || posicion > numTareas) {
            System.out.println("Error: Posición no válida.");
            return;
        }
        tareas[posicion - 1] = nuevaTarea;
        System.out.println("Tarea en posición " + posicion + " modificada.");
    }

    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Modificar tarea");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce la tarea: ");
                    gestor.añadirTarea(entrada.nextLine());
                }

                case 2 -> gestor.listarTareas();

                case 3 -> {
                    if (gestor.numTareas == 0) {
                        System.out.println("La lista de tareas está vacía.");
                        break;
                    }
                    System.out.print("Posición de la tarea a eliminar: ");
                    gestor.eliminarTarea(entrada.nextInt());
                    entrada.nextLine(); // Limpiar buffer
                }

                case 4 -> {
                    if (gestor.numTareas == 0) {
                        System.out.println("La lista de tareas está vacía.");
                        break;
                    }
                    System.out.print("Posición de la tarea a modificar: ");
                    int pos = entrada.nextInt();
                    entrada.nextLine(); // Limpiar buffer
                    System.out.print("Nueva descripción: ");
                    gestor.modificarTarea(pos, entrada.nextLine());
                }

                case 5 -> System.out.println("Saliendo del gestor de tareas...");

                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}