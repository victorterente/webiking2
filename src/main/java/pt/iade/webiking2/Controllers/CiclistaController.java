package pt.iade.webiking2.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.webiking2.Models.Ciclista;
import pt.iade.webiking2.Models.Repositories.CiclistaRepository;

@RestController
@RequestMapping(path="/api/ciclista")

public class CiclistaController {
    private Logger logger = LoggerFactory.getLogger(CiclistaController.class);
    @Autowired
    private CiclistaRepository ciclistaRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Ciclista> getCiclista() {
        logger.info("Sending all ciclistas");
        return ciclistaRepository.findAll();
    }
}
