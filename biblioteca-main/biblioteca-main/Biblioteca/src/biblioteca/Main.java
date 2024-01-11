package biblioteca;
/**
 *
 * * @author Tabatha Valeria Rivero Rodriguez 
 * 10/01/24
 * sayo melocojon
 */
 
public class Main {
    public static void main(String[] args){
    Biblioteca biblioteca = new Biblioteca();
        //Crear y agregar libros.
    Libro libro1 = new Libro("El señor de los anillos", "J.R.R Tolkien", 1);
    Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 2);
    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);
        //Crear y registrar usuarios.
        Usuario user1 = new Usuario("Juan", 101);
        Usuario user2 = new Usuario("Mario", 202);
        biblioteca.registrarUsuario(user1);
        biblioteca.registrarUsuario(user2);
            //Prestar y devolver libros.
            user1.prestarLibro(libro1);
            user2.prestarLibro(libro2);
            user1.devolverLibro(libro1);
                //Mostrar información de la biblioteca.
                biblioteca.mostrarCatalogo();
                biblioteca.mostrarUsuario();
    }
}