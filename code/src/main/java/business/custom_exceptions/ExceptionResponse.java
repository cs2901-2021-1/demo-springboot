package business.custom_exceptions;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private HttpStatus status;

    public ExceptionResponse(Date timestamp, String message, HttpStatus status) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
    }

    public ExceptionResponse(){
        //DEFAULT CONSTRUCTOR
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
