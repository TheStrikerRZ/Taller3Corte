package Encuesta;

import java.util.Scanner;

public class Encuesta {
    private Persona[] personas;
    private int contadorPersonas;

    public Encuesta() {
        personas = new Persona[6];
        contadorPersonas = 0;
    }

    public void agregarPersona() {
        if (contadorPersonas < 6) {
            Scanner scanner = new Scanner(System.in);
            Persona persona = new Persona();

            System.out.print("Ingrese el nombre: ");
            persona.setNombre(scanner.nextLine());

            System.out.print("Ingrese la cedula: ");
            persona.setCedula(scanner.nextLine());

            System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
            persona.setFechaNacimiento(scanner.nextLine());

            System.out.print("Ingrese el correo: ");
            persona.setCorreo(scanner.nextLine());

            System.out.print("Ingrese la ciudad de residencia: ");
            persona.setCiudadResidencia(scanner.nextLine());

            System.out.print("Ingrese la ciudad de origen: ");
            persona.setCiudadOrigen(scanner.nextLine());

            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese el titulo de la cancion favorita " + (i + 1) + ": ");
                String titulo = scanner.nextLine();
                System.out.print("Ingrese el artista de la cancion favorita " + (i + 1) + ": ");
                String artista = scanner.nextLine();
                persona.agregarCancion(titulo, artista);
            }

            personas[contadorPersonas++] = persona;
            System.out.println("Persona agregada exitosamente.");
        } else {
            System.out.println("No se pueden agregar mas personas.");
        }
    }

    public void mostrarInformacionPersona(int posicion) {
        if (posicion >= 0 && posicion < contadorPersonas) {
            personas[posicion].mostrarInformacion();
        } else {
            System.out.println("Posicion invalida.");
        }
    }
}
