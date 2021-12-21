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
            @Column(name="reser_utilizador_id") private int reservautilizadorid;
            @Column(name="reser_bicicleta_id") private int reservabicicletaid;
            

            public int getReservaid() {
                return reservaid;
            }
            public void setReservaid(int reservaid) {
                this.reservaid = reservaid;
            }
            public int getReservautilizadorid() {
                return reservautilizadorid;
            }
            public void setReservautilizadorid(int reservautilizadorid) {
                this.reservautilizadorid = reservautilizadorid;
            }
            public int getReservabicicletaid() {
                return reservabicicletaid;
            }
            public void setReservabicicletaid(int reservabicicletaid) {
                this.reservabicicletaid = reservabicicletaid;
            }
           

            
           

            
           
    }
