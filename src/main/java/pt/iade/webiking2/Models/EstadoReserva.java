package pt.iade.webiking2.Models;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EstadoReserva {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name="reserva_estado_id") private int estadoreservaid;
            @Column(name="reserva_estado") private String estado;
            
			
           

			public String getEstado() {
				return estado;
			}

			public int getEstadoReservaid() {
				return estadoreservaid;
			}
            
}
