package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "evento")
    public class Evento {
        @Id @GeneratedValue
            (strategy = GenerationType.IDENTITY)
            @Column(name="evento_id") private int eventoid;
            @Column(name="evento_origem") private String origem;
            @Column(name="evento_destino") private String destino;
            @Column(name="evento_organizador") private int organizador;
            @Column(name="evento_desc") private String descricao;
            @Column(name="evento_data") private String data;
            
           
           
           
            public void setEventoid(int eventoid) {
                this.eventoid = eventoid;
            }

            public void setOrigem(String origem) {
                this.origem = origem;
            }

            public void setDestino(String destino) {
                this.destino = destino;
            }

            public void setOrganizador(int organizador) {
                this.organizador = organizador;
            }

            public void setDescricao(String descricao) {
                this.descricao = descricao;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public int getEventoid() {
                return eventoid;
            }
           
            public String getOrigem() {
                return origem;
            }
            
            public String getDestino() {
                return destino;
            }
        
            public int getOrganizador() {
                return organizador;
            }
           
            public String getDescricao() {
                return descricao;
            }
           
            
            

        }
            
            
            


           