import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private List<Libro> lista_libros_autor;

    public Autor (String nombreAutor){
        this.nombre = nombreAutor;
        this.lista_libros_autor = new ArrayList<>();
    }

    public void publicar_libro (String tituloLibro){
        Libro nuevoLibro = new Libro (tituloLibro, this.nombre);
        lista_libros_autor.add(nuevoLibro);
        System.out.println(this.nombre + " ha publicado \"" + tituloLibro + "\".");
    }

    // Getters
    public String getNombreAutor(){
        return this.nombre;
    }

    //Obtener lista de libros por autor
    public  List<Libro> getLibrosAutor(){
        return lista_libros_autor;
    }

}
