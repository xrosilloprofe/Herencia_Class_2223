/**
 * Los productos congelados deben llevar la temperatura de congelación recomendada.
 */
package es.ieslavereda.producto;
import java.time.LocalDate;

public class ProductoCongelado extends Producto{

    private int temperaturaCongelacion;

    public ProductoCongelado(LocalDate fechaCaducidad, int numLote, int temperaturaCongelacion) {
        super(fechaCaducidad, numLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public int getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }
    public void setTemperaturaCongelacion(int temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public void anyadirTipoProductoaCodigoBarras() {
        this.setNumLote((this.getNumLote()*100)+22);
    }

    @Override
    public String toString() {
        return super.toString() + " temperatura de congelación recomendada=" + temperaturaCongelacion;
    }

}
