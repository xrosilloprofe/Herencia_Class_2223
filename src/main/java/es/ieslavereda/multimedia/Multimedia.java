package es.ieslavereda.multimedia;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Formato getFormato() {
        return formato;
    }
    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Título =" + titulo +
                ", autor =" + autor +
                ", formato =" + formato.getExtension() +
                ", duración =" + duracion;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Multimedia))
            return false;
        Multimedia multimedia = (Multimedia) obj;
        return (multimedia.titulo.equals(this.titulo) && multimedia.autor.equals(this.autor));
    }


}
