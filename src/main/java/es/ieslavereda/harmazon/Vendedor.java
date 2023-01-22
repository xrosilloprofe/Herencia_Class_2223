package es.ieslavereda.harmazon;

import java.util.Arrays;

public class Vendedor extends Empleado{
    private static final double INCREMENTO=10;
    private Coche coche;
    private String movil;
    private String areaVenta;
    private Cliente[] clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, Coche coche, String movil, String areaVenta, Cliente[] clientes, double comision) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
        this.comision = comision;
    }

    @Override
    public void incrementarSalario() {
        salario = (salario * (1+(INCREMENTO/100)));
    }

    @Override
    public boolean cambiarSupervisor(Empleado nuevoSupervisor) {
        if (!(nuevoSupervisor instanceof Vendedor))
            return false;
        supervisor = nuevoSupervisor;
        return true;
    }

    public void anyadirCliente(Cliente cliente){
        Cliente[] aux;
        if (clientes==null)
            aux = new Cliente[1];
        else {
            aux = new Cliente[clientes.length+1];
            System.arraycopy(clientes,0,aux,0,clientes.length);
        }
        aux[aux.length-1] = cliente;
        clientes = aux;
    }

    public boolean borrarCliente(Cliente cliente) {
        int pos = buscarCliente(cliente);
        if (pos < 0)
            return false;
        Cliente[] aux = new Cliente[clientes.length-1];
        if (pos >0)
            System.arraycopy(clientes,0,aux,0,pos);
        System.arraycopy(clientes,pos+1,aux,pos,(clientes.length-pos)-1);
        clientes = aux;
        return true;
    }

    private int buscarCliente(Cliente cliente){
        if (clientes!=null) {
            for (int i = clientes.length-1; i >=0 ; i--) {
                if(clientes[i].equals(cliente))
                    return i;
            }
        }
        return -1;
    }

    public void cambiarCoche(Coche car){
        this.coche = car;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------\n" + "Vendedor{" +
                "coche=" + coche +
                ", movil='" + movil + '\'' +
                ", areaVenta='" + areaVenta + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                ", comision=" + comision +
                '}' + "\n" + super.toString();
    }

}
