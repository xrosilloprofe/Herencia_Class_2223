/**
 * * Crear una clase Main con el método main donde se cree un objeto de cada
 * tipo y se muestren los datos de cada uno de los objetos creados.
 */
package es.ieslavereda.producto;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        ProductoCongelado gambas = new ProductoCongelado(LocalDate.now().plusDays(10),123,-16);
        gambas.anyadirTipoProductoaCodigoBarras();
        imprimir(gambas);
        ProductoFresco lechuga = new ProductoFresco(LocalDate.now().plusDays(3), 444, LocalDate.of(2023, Month.JANUARY,18),"Spain");
        lechuga.anyadirTipoProductoaCodigoBarras();
        imprimir(lechuga);
        ProductoRefrigerado humus = new ProductoRefrigerado(LocalDate.now().plusWeeks(2), 7373, "Organismo supervisión del humus");
        humus.anyadirTipoProductoaCodigoBarras();
        imprimir(humus);



    }

    public static void imprimir(Producto p){
        System.out.println(p);
    }


}
