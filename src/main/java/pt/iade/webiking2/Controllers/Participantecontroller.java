package pt.iade.webiking2.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.webiking2.Models.Participante;
import pt.iade.webiking2.Models.Repositories.ParticipanteRepository;

@RestController
@RequestMapping(path="/api/participante")
public class Participantecontroller {
    private Logger logger = LoggerFactory.getLogger(Participantecontroller.class);
    @Autowired
    private ParticipanteRepository participanterepository;
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Participante> getEventoid() {
        logger.info("Sending all participantes");
        
        return participanterepository.findAll();

    }
}
