package pt.iade.webiking2.Models.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.webiking2.Models.Reserva;

public interface ReservaRepository extends CrudRepository <Reserva, Integer> {

    @Modifying @Transactional
    @Query(value="insert into reserva (reser_bicicleta_id, reser_utilizador_id,)"+
    "values(4, :#{#reserva.reser_utilizador_id} )", nativeQuery=true)
Integer registerReservaM(@Param("reserva") Reserva reserva);

@Query(value="insert into reserva (reser_bicicleta_id, reser_utilizador_id, reser_estado_id)"+
    "values(2, :#{#reserva.reser_utilizador_id,1} )", nativeQuery=true)
Integer registerReservaC(@Param("reserva") Reserva reserva);


@Query(value="insert into reserva (reser_bicicleta_id, reser_utilizador_id)"+
    "values(5, :#{#reserva.reser_utilizador_id} )", nativeQuery=true)
Integer registerReservaE(@Param("reserva") Reserva reserva);





 }