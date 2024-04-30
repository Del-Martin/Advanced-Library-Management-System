import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private Boolean disponibilidad;
    public static List<Libro> lista_libros = new ArrayList<>();

    public Libro (String tituloLibro, String autorLibro){
        this.titulo = tituloLibro;
        this.autor = autorLibro;
        this.disponibilidad = true;
        lista_libros.add(this);
    }

    public boolean marcar_prestado(){
        return this.disponibilidad = false;
    }

    public boolean marcar_devuelto(){
        return this.disponibilidad = true;
    }

    //Obtener lista completa de libros
    public static List<Libro> getListaLibros(){
        return lista_libros;
    }

    // Getters
    public String getTitulo(){
        return this.titulo;
    }

    public Boolean getDisponibilidad(){
        return this.disponibilidad;
    }

    //Setters
    public void setTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
        System.out.println("Se ha cambiado el título a: " + nuevoTitulo + ".");
    }

    public void setAutor(String nuevoAutor){
        this.autor = nuevoAutor;
        System.out.println("Se ha cambiado el autor a: " + nuevoAutor + ".");
    }

}
