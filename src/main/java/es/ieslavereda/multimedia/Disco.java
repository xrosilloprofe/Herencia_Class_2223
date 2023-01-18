package es.ieslavereda.multimedia;

public class Disco extends Multimedia{
    private String genero;

    public Disco(String titulo, String autor, Formato formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", genero=" + genero;
    }


}
