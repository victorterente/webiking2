package pt.iade.webiking2.Models.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String id, String emlType, String idname) {
        super(emlType + "with" + idname + id + "already exist");
    }
    
}