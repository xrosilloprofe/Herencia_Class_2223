package es.ieslavereda.harmazon;

public class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("aitor","aitor","1A","su casa","2",20000,new Coche("xx","ford","fiesta"),"555","Valencia",null,10);
        System.out.println(v1);
        Cliente c1 = new Cliente("carlos", "carlos", "2Q","su casa","44");
        v1.anyadirCliente(c1);
        System.out.println(v1);
    }
}
