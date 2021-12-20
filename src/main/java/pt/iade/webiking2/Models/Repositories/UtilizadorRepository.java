package pt.iade.webiking2.Models.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import pt.iade.webiking2.Models.Utilizador;

public interface UtilizadorRepository extends CrudRepository <Utilizador, Integer> {

    @Query(value = "insert into utilizador (utilizador_nome, utilizador_email, utilizador_pass,"+
    "utilizador_dtnasc, utilizador_genero, utilizador_tlm)"+
    "values(:nome, :email, "+
    ":pass, :dtnasc"+
    ", :genero, :telemovel )", nativeQuery=true)
Iterable<Utilizador> SignUpUtilizador(String nome, String email, String pass, String dtnasc, char genero, int telelemovel );
 
}
