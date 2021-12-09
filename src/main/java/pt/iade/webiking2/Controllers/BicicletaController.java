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
import pt.iade.webiking2.Models.Bicicleta;
import pt.iade.webiking2.Models.Repositories.BicicletaRepository;


@RestController
@RequestMapping(path="/api/bicicleta")
public class BicicletaController {
    private Logger logger = LoggerFactory.getLogger(BicicletaController.class);
    @Autowired
    private BicicletaRepository bicicletaRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Bicicleta> getBicicleta() {
        logger.info("Sending all bicicletas");
        
        return bicicletaRepository.findAll();

    }


    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Bicicleta saveBicicleta(@RequestBody Bicicleta bicicleta) {
        Bicicleta savedbicicleta = bicicletaRepository.save(bicicleta);
        logger.info("Saving bicicleta with id " + savedbicicleta.getBicicletaid());
        return savedbicicleta;
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<Bicicleta> getBicicletaId(@PathVariable Integer id) {
        logger.info("Sending bicicleta with id:"+ id);
        return bicicletaRepository.findById(id);
    }
}
