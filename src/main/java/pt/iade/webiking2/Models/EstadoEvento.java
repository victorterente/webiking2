package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EstadoEvento {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name="evento_estado_id") private int estadoeventoid;
            @Column(name="evento_estado") private String estado;
            
			
            public void estadoEvento() {}

			public String getEstado() {
				return estado;
			}

			public int getEstadoEventoid() {
				return estadoeventoid;
			}
            
}
