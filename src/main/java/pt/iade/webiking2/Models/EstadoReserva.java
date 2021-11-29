package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estadoReserva")
public class EstadoReserva {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name="reserva_estado_id") private int estadoeventoid;
    @Column(name="reserva_estado") private String estado;
    public int getEstadoeventoid() {
        return estadoeventoid;
    }
    public void setEstadoeventoid(int estadoeventoid) {
        this.estadoeventoid = estadoeventoid;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}
   
   
