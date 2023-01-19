/**
 * Ejercicio 4. Se plantea desarrollar un programa Java que permita la gestión de una empresa agroalimentaria que trabaja con tres tipos
 * de productos:productos frescos, productos refrigerados y productos congelados.
 * Todos los productos llevan esta información común: fecha de caducidad y número de lote.
 * A su vez, cada tipo de producto lleva alguna información específica.
 * Crear el código de las clases Java implementando una relación de herencia desde la superclase Producto hasta las
 * subclases ProductoFresco, ProductoRefrigerado y ProductoCongelado.
 * Cada clase debe disponer de constructor y permitir establecer (set) y recuperar (get) el valor de sus atributos
 * y tener un método que permita mostrar la información del objeto.
 */
package es.ieslavereda.producto;
import java.time.LocalDate;

public abstract class Producto {

    private LocalDate fechaCaducidad;
    private int numLote;

    public Producto(LocalDate fechaCaducidad, int numLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public int getNumLote() {
        return numLote;
    }
    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public abstract void anyadirTipoProductoaCodigoBarras();

    @Override
    public String toString() {
        return " Fecha de Caducidad=" + fechaCaducidad + ", numLote=" + numLote;
    }



}
