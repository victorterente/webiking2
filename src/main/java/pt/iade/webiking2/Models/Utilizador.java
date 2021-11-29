package pt.iade.webiking2.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "utilizador")
public class Utilizador {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
            @Column(name="utilizador_id") private int utilizadorid;
            @Column(name="utilizador_dtnasc") private Date dtnasc;
			@Column(name="utilizador_genero") private String genero;
			@Column(name="utilizador_email") private String email;
			@Column(name="utilizador_pass") private String pass;
			@Column(name="utilizador_tlm") private int telemovel;
			
			

			
			public int getUtilizadorid() {
				return utilizadorid;
			}
			
			public Date getDtnasc() {
				return dtnasc;
			}
			
			public String getGenero() {
				return genero;
			}
			
			public String getEmail() {
				return email;
			}
			
			public String getPass() {
				return pass;
			}
			
			public int getTelemovel() {
				return telemovel;
			}
			
		}
			
			
			
			
			
			
			
	
            
			
            


			
