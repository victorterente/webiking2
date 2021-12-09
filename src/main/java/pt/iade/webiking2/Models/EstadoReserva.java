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
    @Column(name="reserva_estado_id") private int estadoreservaid;
    @Column(name="reserva_estado") private String estado;
    public int getEstadoreservaid() {
        return estadoreservaid;
    }
    public void setEstadoreservaid(int estadoreservaid) {
        this.estadoreservaid = estadoreservaid;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   
}
   
   
