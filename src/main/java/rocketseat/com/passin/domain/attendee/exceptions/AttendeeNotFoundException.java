package rocketseat.com.passin.domain.attendee.exceptions;

import rocketseat.com.passin.dto.attendee.AttendeeIdDTO;

public class AttendeeNotFoundException extends RuntimeException{
    public AttendeeNotFoundException(String message) {
        super(message);
    }
}
