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
import pt.iade.webiking2.Models.EstadoReserva;
import pt.iade.webiking2.Models.Repositories.EstadoReservaRepository;


@RestController
@RequestMapping(path="/api/estadoreserva")
public class EstadoReservaController {
    private Logger logger = LoggerFactory.getLogger(EstadoReservaController.class);
    @Autowired
    private EstadoReservaRepository estadoreservaRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<EstadoReserva> getEstadoReserva() {
        logger.info("Sending all Estadoreserva");
        
        return estadoreservaRepository.findAll();

    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public EstadoReserva saveUtilizador(@RequestBody EstadoReserva estadoreserva) {
        EstadoReserva savedestadoreserva = estadoreservaRepository.save(estadoreserva);
        logger.info("Saving EstadoReserva with id " + savedestadoreserva.getEstadoreservaid());
        return savedestadoreserva;
    }
    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<EstadoReserva> getEstadoReservaById(@PathVariable Integer id) {
        logger.info("Sending estadoreserva with id:"+ id);
        return estadoreservaRepository.findById(id);
    }
}
