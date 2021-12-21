package pt.iade.webiking2.Models.Repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.webiking2.Models.Reserva;

public interface ReservaRepository extends CrudRepository <Reserva, Integer> {

   
    @Query(value="insert into reserva (reser_utilizador_id, reser_bicicleta_id)"+
    "values(:reservautilizadorid, :reservabicicletaid = '2'}})", nativeQuery=true)
Integer registerReservaC(@Param("reserva") Reserva reserva);


 }