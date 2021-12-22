package pt.iade.webiking2.Models.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.webiking2.Models.Participante;

public interface ParticipanteRepository  extends CrudRepository <Participante, Integer> {


    @Modifying @Transactional
    @Query(value="insert into partcipante (part_even_id, part_util_id)"+
    "values(:#{#participante.eventoid}, :#{#participante.utilizadorid} )", nativeQuery=true)
     Integer registerparticipante(@Param("participante") Participante participante);


}