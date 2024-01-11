package biblioteca;
/**
 *
 * @author @author Tabatha Valeria Rivero Rodriguez 
 * 10/01/24
 * sayo melocojon*/
public class Libro {
    private String titulo;
    private int id;
    private String autor;
        //
    public Libro(String titulo, String autor, int id){
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }
        //
    public String getTitulo(){
        return titulo;
    }
        //
    public String getAutor(){
        return autor;
    }
        //
    public int getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return "Libro( "+
                "Titulo = '" + titulo + '\'' +
                ", Autor = '" + autor + '\'' +
                ",id = '" + id +
                '}';
    }
}

