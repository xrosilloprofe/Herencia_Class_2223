package es.ieslavereda.previoexamen;

public class Main {
    public static void main(String[] args) {
        SerVivo vivo = new Palmera(TipoHoja.PERENNE,10,"Palma");
        Arbol arbol = new Palmera(TipoHoja.PERENNE,20,"Palmón");
        Palmera palmera = new Palmera(TipoHoja.PERENNE,1,"Palmito");

        palmera.respirar();
        arbol.respirar();
    }
}
