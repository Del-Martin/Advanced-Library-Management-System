import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    protected List<Libro> libros_prestados;

    public Usuario (String nombreUsuario){
    this.nombre = nombreUsuario;
    this.libros_prestados = new ArrayList<>();
    }

    // Creo funcion libroConcedido para su reutilización
    public void libroConcedido(Libro libro){
        libros_prestados.add(libro);
        libro.marcar_prestado();
        System.out.println("Prestamo del libro aceptado. Devolver en 7 días.");
    }

    public void tomar_prestado(String nombreLibro){
        boolean libroEncontrado = false;

        for (Libro libro : Libro.getListaLibros()){
            if (libro.getTitulo().equals(nombreLibro)){
                libroEncontrado = true;
                if (libro.getDisponibilidad() == true){
                    libroConcedido(libro);
                } else {
                    System.out.println("El libro no esta disponible");
                }
                break;
            }
        }
        if (libroEncontrado == false){
            System.out.println("Libro no encontrado: " + nombreLibro);
        }
    }

    public void devolver_libro (String libroAlquilado){
        boolean libroEncontrado = false;

        for (Libro libro : Libro.getListaLibros()){
            if(libro.getTitulo().equals(libroAlquilado)){
                libroEncontrado = true;
                if(libro.getDisponibilidad() == false){
                    libros_prestados.remove(libro);
                    libro.marcar_devuelto();
                    System.out.println("Libro devuelto, muchas gracias.");
                } else {
                    System.out.println("Este libro no se encuentra prestado.");
                }
                break;
            }
        }
        if (libroEncontrado == false){
            System.out.println("No hemos encontrado el libro llamado: " + libroAlquilado + "." );
        }
    }

    //Setter
    public void setNombreUsuario(String nuevoNombreUsuario){
        this.nombre = nuevoNombreUsuario;
        System.out.println("Se ha cambiado el nombre de usuario a: " + nuevoNombreUsuario + ".");
    }

    //Getters
    public String getNombreUsuario(){
        return this.nombre;
    }

    //Obtener lista de libros prestados
    public List<Libro> getLibrosPrestados(){
        if (libros_prestados.size() < 1) {
            System.out.println("No tiene libros prestados");
        }
        return libros_prestados;
    }


}
