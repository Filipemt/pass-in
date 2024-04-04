package rocketseat.com.passin.domain.attendee.exceptions;

import rocketseat.com.passin.domain.attendee.Attendee;

public class AttendeeAlreadyExistsExcetion extends RuntimeException{
    public AttendeeAlreadyExistsExcetion(String message) {
        super(message);
    }
}
