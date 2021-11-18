package pt.iade.webiking2.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.webiking2.Models.Organizador;
import pt.iade.webiking2.Models.Repositories.OrganizadorRepository;

@RestController
@RequestMapping(path="/api/organizador")
public class OrganizadorController {
    private Logger logger = LoggerFactory.getLogger(OrganizadorController.class);
    @Autowired
    private OrganizadorRepository organizadorrepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Organizador> getOrganizador() {
        logger.info("Sending all organizadores");
        
        return organizadorrepository.findAll();

    }
}
