package es.ieslavereda.harmazon;

import java.util.Arrays;

public class JefeZona extends Empleado {

    private static final double INCREMENTO=20;
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;

    public JefeZona(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String despacho, Secretario secretario, Vendedor[] vendedores, Coche coche) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }

    @Override
    public void incrementarSalario() {
        salario = (salario * (1+(INCREMENTO/100)));
    }

    @Override
    public boolean cambiarSupervisor(Empleado nuevoSupervisor) {
        if (!(nuevoSupervisor instanceof JefeZona))
            return false;
        supervisor = nuevoSupervisor;
        return true;
    }

    public void cambiarSecretario(Secretario newSecre) {
        this.secretario = newSecre;
    }
    public void cambiarCoche(Coche car){
        this.coche = car;
    }

    public void anyadirVendedor(Vendedor vendedor){
        Vendedor[] aux;
        if (vendedores==null)
            aux = new Vendedor[1];
        else {
            aux = new Vendedor[vendedores.length+1];
            System.arraycopy(vendedores,0,aux,0,vendedores.length);
        }
        aux[aux.length-1] = vendedor;
        vendedores = aux;
    }

    public boolean borrarVendedor(Vendedor vendedor) {
        int pos = buscarVendedor(vendedor);
        if (pos < 0)
            return false;
        Vendedor[] aux = new Vendedor[vendedores.length-1];
        if (pos >0)
            System.arraycopy(vendedores,0,aux,0,pos);
        System.arraycopy(vendedores,pos+1,aux,pos,(vendedores.length-pos)-1);
        vendedores = aux;
        return true;
    }

    private int buscarVendedor(Vendedor vendedor){
        if (vendedores!=null) {
            for (int i = vendedores.length-1; i >=0 ; i--) {
                if(vendedores[i].equals(vendedor))
                    return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------\n" + "JefeZona{" +
                "despacho='" + despacho + '\'' +
                ", secretario=" + secretario +
                ", vendedores=" + Arrays.toString(vendedores) +
                ", coche=" + coche +
                '}' + "\n" + super.toString();
    }

}
