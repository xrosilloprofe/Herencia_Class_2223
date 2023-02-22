package es.ieslavereda.previoexamen;

public enum TipoHoja {
    PERENNE("Hoja perenne, no se cae"),
    CADUCA("Hoja caduca, se cae");

    private final String tipo;

    TipoHoja(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return tipo;
    }

}
