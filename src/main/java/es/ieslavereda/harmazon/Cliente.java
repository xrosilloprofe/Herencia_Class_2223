package es.ieslavereda.harmazon;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private LocalDate antiguedad;
    private String telefono;

    public Cliente(String nombre, String apellidos, String DNI, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.antiguedad = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDNI() {
        return DNI;
    }
    public String getDireccion() {
        return direccion;
    }
    public LocalDate getAntiguedad() {
        return antiguedad;
    }
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
