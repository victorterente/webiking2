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
import pt.iade.webiking2.Models.Reserva;
import pt.iade.webiking2.Models.Exceptions.Response;
import pt.iade.webiking2.Models.Repositories.ReservaRepository;



@RestController
@RequestMapping(path="/api/reserva")
public class ReservaController {
     private Logger logger = LoggerFactory.getLogger(ReservaController.class);
@Autowired
private ReservaRepository reservaRepository;

@GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
public Iterable<Reserva> getReserva() {
    logger.info("Sending all reservas");
    
    return reservaRepository.findAll();
}

@PostMapping(path = "/newC", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response saveStudent(@RequestBody Reserva reservaid) {
        logger.info("Registering reserva with id " + reservaid.getReservaid());
        Integer inserted = reservaRepository.registerReservaC(reservaid);
    return new Response(inserted+" registration created",reservaid);
    }


@GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
public Optional<Reserva> getReservaById(@PathVariable Integer id) {
    logger.info("Sending reserva with id:"+ id);
    return reservaRepository.findById(id);
}




}
