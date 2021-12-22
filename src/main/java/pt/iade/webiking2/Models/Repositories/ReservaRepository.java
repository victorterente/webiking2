package pt.iade.webiking2.Models.Repositories;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.webiking2.Models.Reserva;

public interface ReservaRepository extends CrudRepository <Reserva, Integer> {

   
    @Modifying @Transactional
    @Query(value="insert into reserva (reser_utilizador_id, reser_bicicleta_id)"+
    "values(:#{#reserva.reservautilizadorid}, :#{#reserva.reservabicicletaid} )", nativeQuery=true)
     Integer registerreserva(@Param("reserva") Reserva reserva);


 }