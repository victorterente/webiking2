package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "reserva")
    public class Reserva{
        @Id @GeneratedValue
            (strategy = GenerationType.IDENTITY)
            @Column(name="reserva_id") private int reservaid;
            @Column(name="reserva_tipobicicleta") private String tipoBicicleta;
            @Column(name="reserva_preco") private double preco;
            @Column(name="reserva_descricao") private String descricao;

            
            public Reserva() {}

            public int getReservaid() {
                return reservaid;
            }

            public double getPreco() {
                return preco;
            }

            public String getTipoBicicleta() {
                return tipoBicicleta;
            }
            public String getDescricao() {
                return descricao;
            }
    }
