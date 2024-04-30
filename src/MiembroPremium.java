import java.util.ArrayList;
import java.util.List;

public class MiembroPremium extends Usuario {
    List<Libro> libros_reservados;

    public MiembroPremium(String nombreMiembroPremium) {
        super(nombreMiembroPremium);
        this.libros_reservados = new ArrayList<>();
    }

    public void reservar_libro(String nombreLibro) {
        Boolean libroEncontrado = false;

        for (Libro libro : Libro.getListaLibros()) {
            if (libro.getTitulo().equals(nombreLibro)) {
                libroEncontrado = true;
                if (libro.getDisponibilidad() == false) {
                    libros_reservados.add(libro);
                    System.out.println("El libro se encuentra prestado, lo hemos agregado a tu lista de reservados.");
                } else {
                    libroConcedido(libro);
                }
                break;
            }
        }
        if (libroEncontrado == false) {
            System.out.println("Libro no encontrado: " + nombreLibro);
        }
    }

    //Obtener lista de libros reservados
    public List<Libro> getLibrosReservados(){
        if (libros_reservados.size() < 1) {
            System.out.println("No tiene libros prestados");
        }
        return libros_reservados;
    }



}
