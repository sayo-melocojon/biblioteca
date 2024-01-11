package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Tabatha Valeria Rivero Rodriguez 
 * 10/01/24
 * sayo melocojon
 */
public class Usuario {
    private String nombre;
    private int id;
    private ArrayList<Libro> librosPrestados;
        //
    public Usuario(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }
        //
    public String getNombre(){
        return nombre;
    }
        //
    public int getId(){
        return id;
    }
        //
    public ArrayList<Libro> getLibrosPrestados(){
        return librosPrestados;
    }
        //
    public void prestarLibro(Libro libro){
        if(!librosPrestados.contains(libro)){
            librosPrestados.add(libro);
            System.out.println("Libro prestado: " + libro.toString());
        }else{
            System.out.println("Este libro ya ha sido prestado.");
        }
    }
    public void devolverLibro(Libro libro){
        if(!librosPrestados.contains(libro)){
            librosPrestados.remove(libro);
            System.out.println("Libro devuelto: " + libro.toString());
        }else{
            System.out.println("No puedes devolver un libro que no has tomado.");
        }
    }
    @Override
    public String toString(){
        return "String( " +
                "nombre = '" + nombre + '\'' +
                ",id = '" + id + 
                ", librosPrestados = '" + librosPrestados + 
                '}';
    }
}

