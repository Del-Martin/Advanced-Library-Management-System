//Martín Delfini
public class Main {
    public static void main(String[] args) {

    //Creamos 2 autores

        Autor leonardoPadura = new Autor("Leonardo Padura");
        Autor georgeOrwell = new Autor("George Orwell");

    //Autores publican sus libros

        System.out.println();

        System.out.println("Autores publican sus libros:");
        System.out.println();

        leonardoPadura.publicar_libro("El hombre que amaba a los perros");
        leonardoPadura.publicar_libro("Personas decentes");
        leonardoPadura.publicar_libro("Herejes");

        System.out.println();

        georgeOrwell.publicar_libro("1984");
        georgeOrwell.publicar_libro("Rebelión en la granja");
        georgeOrwell.publicar_libro("Homenaje a Cataluña");

        System.out.println();

    // Imprimir la línea separadora
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

    // Vemos que se agreguen los libros a las listas de Autores

        System.out.println( "Lista de libros publicados por " + leonardoPadura.getNombreAutor() + ":");
        for (Libro listaLibrosAutor : leonardoPadura.getLibrosAutor()){
            System.out.println(listaLibrosAutor.getTitulo());
        }

        System.out.println();

        System.out.println();

    // Imprimir la línea separadora
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

    // Vemos que se agreguen y funcione la lista general de libros

        System.out.println( "Lista general de libros:");
        for (Libro listaLibros : Libro.getListaLibros()){
            System.out.println(listaLibros.getTitulo());
        }

        System.out.println();

    //Creamos Usuario y Miembro Premium

        Usuario juanGandolfo = new Usuario("Juan Gandolfo");

        MiembroPremium lionelMessi = new MiembroPremium("Lionel Andrés Messi");

    // Imprimir la línea separadora
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

    // Usuario toma prestado y un libro. Evaluamos posibilidades.
        System.out.println("Juan pide prestado el libro \"Rebelión en la granja\":");
        juanGandolfo.tomar_prestado("Rebelión en la granja");
        System.out.println();

        // Repetimos pedido para evaluar respuesta
        System.out.println("Repetimos solicitud para evaluar respuesta:");
        juanGandolfo.tomar_prestado("Rebelión en la granja");

        System.out.println();

    // Imprimir la línea separadora
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

    // MiembroPremium reserva un libro no disponible y uno disponible.

        System.out.println("Messi intenta reservar \"Rebelión en la granja\":");
        lionelMessi.reservar_libro("Rebelión en la granja");

        System.out.println();

        System.out.println("Messi intenta reservar \"El hombre que amaba a los perros\":");
        lionelMessi.reservar_libro("El hombre que amaba a los perros");

        System.out.println();

        System.out.println("Messi intenta reservar \"1984\":");
        lionelMessi.reservar_libro("1984");

        System.out.println();

        // Verificamos que los libros se han agregado a sus respectivas listas
        System.out.println( "Lista de libros prestados a " + lionelMessi.getNombreUsuario() + ":");
        for (Libro listaPrestados : lionelMessi.getLibrosPrestados()){
            System.out.println(listaPrestados.getTitulo());
        }

        System.out.println();

        System.out.println( "Lista de libros reservados por " + lionelMessi.getNombreUsuario() + ":");
        for (Libro listaReservados : lionelMessi.getLibrosReservados()){
            System.out.println(listaReservados.getTitulo());
        }

        System.out.println();





    }
}