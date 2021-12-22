package pt.iade.webiking2.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.webiking2.Models.Exceptions.Response;
import pt.iade.webiking2.Models.Repository.QueryRepository;
import pt.iade.webiking2.Models.Evento;
import pt.iade.webiking2.Models.Utilizador;


@RestController
@RequestMapping(path = "/api/querys")
public class QueryController {

    private final Logger logger = LoggerFactory.getLogger(QueryController.class);

    @Autowired
    private QueryRepository queryRepository;

    @GetMapping(path = "/utilizador_info/{nome:[.-z]+}/{pass:[.-z]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> get_utilizador_info(@PathVariable("nome") String email,@PathVariable("pass") String pass) {
        logger.info("Sending bio from route nome: ,pass:" +email +pass);
        return queryRepository.utilizador_info(email,pass);
    }



   
    @GetMapping(path = "/evento_info/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<String> get_evento_info(@PathVariable("id") int id) {
        logger.info("Sending bio from route id:" + id);
        return queryRepository.evento_info(id);
    }


}
