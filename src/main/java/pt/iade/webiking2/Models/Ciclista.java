package pt.iade.webiking2.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "ciclistas")
public class Ciclista {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
            @Column(name="ciclista_id") private int ciclistaid;
            @Column(name="ciclista_nome") private String nome;
            @Column(name="ciclista_numero") private int numero;
			@Column(name="ciclista_email") private int email;

        
			
			private List<Evento> eventos;

            
			public String getNome() {
				return nome;
			}

			public int getnumero() {
				return numero;
			}
            public int getEmail() {
				return email;
			}

			public List<Evento> getEventos() {
				return eventos;
			}

			public int getCiclistaid() {
				return ciclistaid;
			}

    }
