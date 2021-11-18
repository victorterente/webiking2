package pt.iade.webiking2.Models.Repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.webiking2.Models.EstadoEvento;
 

public interface EstadoEventoRepository extends CrudRepository <EstadoEvento, Integer> { }