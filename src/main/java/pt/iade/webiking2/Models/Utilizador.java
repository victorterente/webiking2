package pt.iade.webiking2.Models;



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
			@Column(name="utilizador_nome") private String nome;
            @Column(name="utilizador_dtnasc") private String dtnasc;
			@Column(name="utilizador_genero") private String genero;
			@Column(name="utilizador_email") private String email;
			@Column(name="utilizador_pass") private String pass;
			@Column(name="utilizador_tlm") private int telemovel;
			
			

			
			public String getNome() {
				return nome;
			}

			
			public void setUtilizadorid(int utilizadorid) {
				this.utilizadorid = utilizadorid;
			}


			public void setNome(String nome) {
				this.nome = nome;
			}


			public void setDtnasc(	String dtnasc) {
				this.dtnasc = dtnasc;
			}


			public void setGenero(String genero) {
				this.genero = genero;
			}


			public void setEmail(String email) {
				this.email = email;
			}


			public void setPass(String pass) {
				this.pass = pass;
			}


			public void setTelemovel(int telemovel) {
				this.telemovel = telemovel;
			}


			public int getUtilizadorid() {
				return utilizadorid;
			}
			
			public String getDtnasc() {
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
			
			
			
			
			
			
			
	
            
			
            


			
