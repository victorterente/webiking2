package pt.iade.webiking2.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.webiking2.Models.Evento;
import pt.iade.webiking2.Models.Repositories.EventoRepository;

@RestController
@RequestMapping(path="/api/evento")
public class EventoController {
    private Logger logger = LoggerFactory.getLogger(EventoController.class);
    @Autowired
    private EventoRepository eventorepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Evento> getEvento() {
        logger.info("Sending all eventos");
        
        return eventorepository.findAll();

    }
}

