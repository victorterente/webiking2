package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Evento")
    public class Evento {
        @Id @GeneratedValue
            (strategy = GenerationType.IDENTITY)
            @Column(name="evento_id") private int eventoid;
            @Column(name="evento_origem") private String origem;
            @Column(name="evento_destino") private String destino;
            @Column(name="evento_pp") private String pp;
            @Column(name="evento_participantes") private int participantes;
            @Column(name="evento_descricao") private String descricao;

            public int getId() {
                return eventoid;
            }

            public String getOrigem() {
                return origem;
            }

        
            public String getDestino() {
                return destino;
            }
            

            public String getPp() {
                return pp;
            }

            public int getParticipantes() {
                return participantes;
            }
            public String getdescricao() {
                return descricao;
            }
    }
