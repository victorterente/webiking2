package pt.iade.webiking2.Controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.webiking2.Models.Reserva;
import pt.iade.webiking2.Models.Repositories.ReservaRepository;






@RestController
@RequestMapping(path="/api/reserva")
public class ReservaController {
     private Logger logger = LoggerFactory.getLogger(ReservaController.class);
@Autowired
private ReservaRepository reservarepository;

@GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
public Iterable<Reserva> getReserva() {
    logger.info("Sending all organizadores");
    
    return reservarepository.findAll();
}
}
