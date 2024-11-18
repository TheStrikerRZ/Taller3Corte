package Encuesta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Encuesta encuesta = new Encuesta();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar persona encuestada");
            System.out.println("2. Mostrar datos de una persona");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    encuesta.agregarPersona();
                    break;
                case 2:
                    System.out.print("Ingrese la posicion de la persona (0-5): ");
                    int posicion = scanner.nextInt();
                    encuesta.mostrarInformacionPersona(posicion);
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
