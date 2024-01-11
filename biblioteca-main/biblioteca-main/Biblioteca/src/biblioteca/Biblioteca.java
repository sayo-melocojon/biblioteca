package biblioteca;
import java.util.ArrayList;

/**
 *
 * @author Tabatha Valeria Rivero Rodriguez 
 * 10/01/24
 * sayo melocojon
 */
public class Biblioteca {
    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuarios;
    
    public Biblioteca(){
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
        //
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario registrado " + usuario.toString());
    }
        //
    public void agregarLibro(Libro libro){
        catalogo.add(libro);
        System.out.println("Libro agregado al catalogo: " + libro.toString());
    }
        //
    public void mostrarCatalogo(){
        System.out.println("Catalogo de la biblioteca: ");
        for(Libro libro : catalogo){
            System.out.println(libro.toString());
        }
    }
        //
    public void mostrarUsuario(){
        System.out.println("Usuarios registrados: ");
        for(Usuario usuario : usuarios){
            System.out.println(usuario.toString());
        }
    }
    
}