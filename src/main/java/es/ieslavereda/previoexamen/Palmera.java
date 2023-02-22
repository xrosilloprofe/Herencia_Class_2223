package es.ieslavereda.previoexamen;

public class Palmera extends Arbol{

    private String nombre;
    private boolean podado;

    public Palmera(TipoHoja hoja, int altura, String nombre) {
        super(hoja, altura);
        this.nombre = nombre;
        this.podado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean podar(boolean podado){
        this.podado = true;
        return true;
    }

    @Override
    public String florecer(){
        return "He florecido";
    }

    @Override
    public void morir(){
        this.setVivo(false);
    }

}
