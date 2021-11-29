package pt.iade.webiking2.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventoEstado")
public class EstadoEvento {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name="evento_estado_id") private int estadoeventoid;
    @Column(name="evento_estado") private String estado;
   
   
   
   
    public int getEstadoeventoid() {
        return estadoeventoid;
    }
   
    public String getEstado() {
        return estado;
    }

    
}

