package pt.iade.webiking2.Controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.webiking2.Models.EstadoEvento;
import pt.iade.webiking2.Models.Repositories.EstadoEventoRepository;



@RestController
@RequestMapping(path="/api/estadoevento")
public class EstadoEventoController {
    private Logger logger = LoggerFactory.getLogger(EstadoEventoController.class);
    @Autowired
    private EstadoEventoRepository estadoeventoRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<EstadoEvento> getEstadoEvento() {
        logger.info("Sending all Estadoseventos");
        
        return estadoeventoRepository.findAll();

    }


    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public EstadoEvento saveUtilizador(@RequestBody EstadoEvento estadoevento) {
        EstadoEvento savedestadoevento = estadoeventoRepository.save(estadoevento);
        logger.info("Saving utilizador with id " + savedestadoevento.getEstadoeventoid());
        return savedestadoevento;
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<EstadoEvento> getEstadoEventoById(@PathVariable Integer id) {
        logger.info("Sending estadoevento with id:"+ id);
        return estadoeventoRepository.findById(id);
    }
}
