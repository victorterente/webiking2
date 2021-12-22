package pt.iade.webiking2.Models.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.webiking2.Models.Utilizador;

public interface UtilizadorRepository extends CrudRepository <Utilizador, Integer> {

    @Modifying @Transactional
    @Query(value="insert into utilizador (utilizador_nome, utilizador_email, utilizador_pass,"+
    "utilizador_dtnasc, utilizador_genero, utilizador_telemovel)"+
    "values(:#{#utilizador.nome}, :#{#utilizador.email}, "+
    ":#{#utilizador.pass}, :#{#utilizador.dtnasc}"+
    ", :#{#utilizador.genero}, :#{#utilizador.telemovel} )", nativeQuery=true)
Integer registerUtilizador(@Param("utilizador") Utilizador utilizador);

@Query(value = "select utilizador_existe(:nome,:pass)", nativeQuery = true)
    Iterable<String> Exite_utilizador(String nome, String pass);

    Iterable<Utilizador> getUtilizadorNome(String nome);
    
    @Query(value = "insert into utilizador (utilizador_nome, utilizador_email, utilizador_pass,"+
    "utilizador_dtnasc, utilizador_genero, utilizador_telemovel)"+
    "values(:nome, :email, "+
    ":pass, :dtnasc"+
    ", :genero, :telemovel);", nativeQuery=true)
Iterable<Utilizador> SignUpUtilizador(String nome, String email, String pass, String dtnasc, char genero, int telemovel );
 
}
