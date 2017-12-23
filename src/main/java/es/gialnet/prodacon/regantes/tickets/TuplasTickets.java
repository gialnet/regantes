package es.gialnet.prodacon.regantes.tickets;

import java.io.Serializable;
import java.util.Date;

public class TuplasTickets  implements Serializable {

    private static final long serialVersionUID = 1L;

    Long id;
    Long estanque;
    Long nticket;
    String canal_compra;
    Long minutos_comprados;
    Date fecha_buy;
    String pendiente;
    String observaciones;

    public TuplasTickets() {
    }

    public TuplasTickets(Long id, Long estanque, Long nticket, String canal_compra, Long minutos_comprados, Date fecha_buy, String pendiente, String observaciones) {
        this.id = id;
        this.estanque = estanque;
        this.nticket = nticket;
        this.canal_compra = canal_compra;
        this.minutos_comprados = minutos_comprados;
        this.fecha_buy = fecha_buy;
        this.pendiente = pendiente;
        this.observaciones = observaciones;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEstanque() {
        return estanque;
    }

    public void setEstanque(Long estanque) {
        this.estanque = estanque;
    }

    public Long getNticket() {
        return nticket;
    }

    public void setNticket(Long nticket) {
        this.nticket = nticket;
    }

    public String getCanal_compra() {
        return canal_compra;
    }

    public void setCanal_compra(String canal_compra) {
        this.canal_compra = canal_compra;
    }

    public Long getMinutos_comprados() {
        return minutos_comprados;
    }

    public void setMinutos_comprados(Long minutos_comprados) {
        this.minutos_comprados = minutos_comprados;
    }

    public Date getFecha_buy() {
        return fecha_buy;
    }

    public void setFecha_buy(Date fecha_buy) {
        this.fecha_buy = fecha_buy;
    }

    public String getPendiente() {
        return pendiente;
    }

    public void setPendiente(String pendiente) {
        this.pendiente = pendiente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "TuplasTickets{" +
                "id=" + id +
                ", estanque=" + estanque +
                ", nticket=" + nticket +
                ", canal_compra='" + canal_compra + '\'' +
                ", minutos_comprados=" + minutos_comprados +
                ", fecha_buy=" + fecha_buy +
                ", pendiente='" + pendiente + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
