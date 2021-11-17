package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organizador")
    public class Organizador{
        @Id @GeneratedValue
            (strategy = GenerationType.IDENTITY)
            @Column(name="organizador_id") private int organizadorid;
            @Column(name="organizador_nome") private String nome;
            @Column(name="organizador_numero") private int numero;
            @Column(name="organizador_email") private String email;


            public int getNumero() {
                return numero;
            }
            public String getEmail() {
                return email;
            }
            public String getNome() {
                return nome;
            }

            public int getOrganizadorid() {
                return organizadorid;
            }

    }

