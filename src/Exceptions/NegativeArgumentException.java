package Exceptions;

/**
 * Exception vérifiée
 */
public class NegativeArgumentException extends Exception{
    public NegativeArgumentException(){
        super();
    }

    public NegativeArgumentException(String m){
        super(m);
    }
}
