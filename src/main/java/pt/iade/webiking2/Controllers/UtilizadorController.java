package pt.iade.webiking2.Controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.webiking2.Models.Utilizador;
import pt.iade.webiking2.Models.Repositories.UtilizadorRepository;

@RestController
@RequestMapping(path="/api/utilizador")

public class UtilizadorController {
    private Logger logger = LoggerFactory.getLogger(UtilizadorController.class);
    @Autowired
    private UtilizadorRepository utilizadorRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> getUtilizador() {
        logger.info("Sending all utilizadores");
        return utilizadorRepository.findAll();
    }
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilizador saveUtilizador(@RequestBody Utilizador utilizador) {
        Utilizador savedutilizador = utilizadorRepository.save(utilizador);
        logger.info("Saving utilizador with id " + savedutilizador.getUtilizadorid());
        return savedutilizador;
    }

   
   
    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<Utilizador> getUtilizadorById(@PathVariable Integer id) {
        logger.info("Sending utilizador with id:"+ id);
        return utilizadorRepository.findById(id);
    }




}