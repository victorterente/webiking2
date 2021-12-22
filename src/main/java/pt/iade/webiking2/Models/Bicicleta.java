package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bicicleta")

 public class Bicicleta {
        @Id @GeneratedValue
            (strategy = GenerationType.IDENTITY)
            @Column(name="bicicleta_id") private int bicicletaid;
            @Column(name="bicicleta_desc") private String descricao;
            @Column(name="bicicleta_tipo") private String tipo;
            @Column(name="bicicleta_cor") private String cor;
            @Column(name="bicicleta_preco") private String preco;
           

            public void setBicicletaid(int bicicletaid) {
                this.bicicletaid = bicicletaid;
            }

            public void setDescricao(String descricao) {
                this.descricao = descricao;
            }

            public void setTipo(String tipo) {
                this.tipo = tipo;
            }

            public void setCor(String cor) {
                this.cor = cor;
            }

            public String getPreco() {
                return preco;
            }

            public void setPreco(String preco) {
                this.preco = preco;
            }

            public int getBicicleta(){

                return bicicletaid;
            }

            public int getBicicletaid() {
                return bicicletaid;
            }
            
            public String getDescricao() {
                return descricao;
            }
            
            public String getTipo() {
                return tipo;
            }

            public String getCor() {
                return cor;
            }


 }
            
 
 
