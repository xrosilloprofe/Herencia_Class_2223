/**
 * Los productos refrigerados deben llevar el código del organismo de supervisión alimentaria.
 */
package es.ieslavereda.producto;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

    private String codigoOrganismoSupervision;

    public ProductoRefrigerado(LocalDate fechaCaducidad, int numLote, String codigoOrganismoSupervision) {
        super(fechaCaducidad, numLote);
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }
    public String getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }
    public void setCodigoOrganismoSupervision(String codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }
    @Override
    public void anyadirTipoProductoaCodigoBarras() {
        this.setNumLote((this.getNumLote()*100)+33);
    }

    @Override
    public String toString() {
        return super.toString() + " código del organismo de supervision alimenticia=" + codigoOrganismoSupervision;
    }

}
