package pt.iade.webiking2.Controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.webiking2.Models.Evento;
import pt.iade.webiking2.Models.Repositories.EventoRepository;

@RestController
@RequestMapping(path="/api/evento")
public class EventoController {
    private Logger logger = LoggerFactory.getLogger(EventoController.class);
    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Evento> getEvento() {
        logger.info("Sending all eventos");
        
        return eventoRepository.findAll();

    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<Evento> getEventoById(@PathVariable Integer id) {
        logger.info("Sending evento with id:"+ id);
        return eventoRepository.findById(id);
    }
}