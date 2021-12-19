package pt.iade.webiking2.Models.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import pt.iade.webiking2.Models.Utilizador;

public interface QueryRepository extends CrudRepository<Utilizador, Integer> {


    @Query(value = "select utilizador_id from utilizador where utilizador_pass = :pass and utilizador_email = :nome", nativeQuery = true)
    Iterable<Utilizador> utilizador_info(String nome, String pass);


    @Query(value = "select * from evento where evento_id = :id", nativeQuery = true)
    Iterable<String> evento_info(int id);

    @Query(value = " select criar_utilizador(:nome,:morada,:genero,:data,:identificacao,:email,:pass, :num_card, :cvv ,:nome_cartao", nativeQuery = true)
    Iterable<String> criar_utilizador(String nome,String morada,char genero,String data,int identificacao,String email, String pass, int num_card, int cvv, String nome_cartao);
   
    

}
