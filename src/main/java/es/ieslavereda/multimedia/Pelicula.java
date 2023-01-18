package es.ieslavereda.multimedia;

public class Pelicula extends Multimedia {

    private final static String ANIMACION= "Animación";

    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.actriz = ANIMACION;
        this.actor = ANIMACION;
    }

    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        if (actor == null && actriz == null) {
            this.actriz = ANIMACION;
            this.actor = ANIMACION;
        } else {
            this.actriz = actriz;
            this.actor = actor;
        }

    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString(){
        if (actriz.equals(ANIMACION) && actor.equals(ANIMACION))
            return super.toString() + " peli de animación sin actores";
        else
            return super.toString() + " ,actor= " + actor + " ,actriz= " + actriz;
    }
}
