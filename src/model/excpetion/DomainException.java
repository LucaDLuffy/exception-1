package model.excpetion;

import java.io.Serial;

public class DomainException extends RuntimeException { //criei essa exceção e entendi excption para tratar
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
