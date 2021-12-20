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
import pt.iade.webiking2.Models.Evento;
import pt.iade.webiking2.Models.Exceptions.Response;
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
    @PostMapping(path = "/new", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response saveStudent(@RequestBody Evento eventoid) {
        logger.info("Registering utilizador with id " + eventoid.getEventoid());
        Integer inserted = eventoRepository.registerStudent(eventoid);
    return new Response(inserted+" registration created",eventoid);
    }

    
    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<Evento> getEventoById(@PathVariable Integer id) {
        logger.info("Sending evento with id:"+ id);
        return eventoRepository.findById(id);
    }
}
