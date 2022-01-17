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
import pt.iade.webiking2.Models.Utilizador;
import pt.iade.webiking2.Models.Exceptions.NotFoundException;
import pt.iade.webiking2.Models.Exceptions.Response;
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

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilizador getADD(@PathVariable int utilizadorid) {
        logger.info("Sending user with id " + utilizadorid);
        Optional<Utilizador> _utilizador = utilizadorRepository.findById(utilizadorid);
        if (!_utilizador.isPresent()) throw
                new NotFoundException("" + utilizadorid, "User", "id");
        else
            return _utilizador.get();
    }

    
    @PostMapping(path = "/new", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response saveStudent(@RequestBody Utilizador utilizadorid) {
        logger.info("Registering utilizador with id " + utilizadorid.getUtilizadorid());
        Integer inserted = utilizadorRepository.registerUtilizador(utilizadorid);
    return new Response(inserted+" registration created",utilizadorid);
    }

    @GetMapping(path = "/nome/{utilizador_nome}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<String> getUtilizador(@PathVariable(value = "utilizador_nome") String nome) {
        logger.info("Sending all utilizadores with type" +nome);
        return utilizadorRepository.findByNome(nome);
    }


   
    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<Utilizador> getUtilizadorById(@PathVariable Integer id) {
        logger.info("Sending utilizador with id:"+ id);
        return utilizadorRepository.findById(id);
    }




}
