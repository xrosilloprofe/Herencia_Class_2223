/**
 * Los productos frescos deben llevar la fecha de envasado y el país de origen.
 */
package es.ieslavereda.producto;
import java.time.LocalDate;

public class ProductoFresco extends Producto{

    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void anyadirTipoProductoaCodigoBarras() {
        this.setNumLote((this.getNumLote()*100)+11);
    }

    @Override
    public String toString() {
        return super.toString() + " fecha de envasado=" + fechaEnvasado + ", pais de origen=" + paisOrigen;
    }

}
