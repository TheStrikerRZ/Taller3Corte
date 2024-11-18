package Encuesta;

public class Persona {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String correo;
    private String ciudadResidencia;
    private String ciudadOrigen;
    private Cancion[] cancionesFavoritas;
    private int contadorCanciones;

    public Persona() {
        cancionesFavoritas = new Cancion[3];
        contadorCanciones = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void agregarCancion(String titulo, String artista) {
        if (contadorCanciones < 3) {
            cancionesFavoritas[contadorCanciones++] = new Cancion(titulo, artista);
        } else {
            System.out.println("No se pueden agregar mas de 3 canciones favoritas.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad de Residencia: " + ciudadResidencia);
        System.out.println("Ciudad de Origen: " + ciudadOrigen);
        System.out.println("Canciones Favoritas:");
        for (Cancion cancion : cancionesFavoritas) {
            if (cancion != null) {
                cancion.mostrarCancion();
            }
        }
    }
}
