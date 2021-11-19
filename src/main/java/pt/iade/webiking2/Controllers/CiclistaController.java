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
   
   
   
    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<Ciclista> getCiclistaById(@PathVariable Integer id) {
        logger.info("Sending ciclista with id:"+ id);
        return ciclistaRepository.findById(id);
    }




}
