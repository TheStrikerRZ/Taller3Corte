package Encuesta;

public class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public void mostrarCancion() {
        System.out.println("Titulo: " + titulo + ", Artista: " + artista);
    }
}
