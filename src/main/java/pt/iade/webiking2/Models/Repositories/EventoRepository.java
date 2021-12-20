package pt.iade.webiking2.Models.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.webiking2.Models.Evento;

public interface EventoRepository extends CrudRepository <Evento, Integer> {

    @Modifying @Transactional
    @Query(value="insert into evento (evento_origem, evento_destino, evento_organizador,"+
    "evento_data, evento_descricao)"+
    "values(:#{#evento.origem}, :#{#evento.destino}, "+
    ":#{#evento.organizador}, :#{#evento.data}"+
    ", :#{#evento.descricao} )", nativeQuery=true)
Integer registerevento(@Param("evento") Evento evento);

 }

