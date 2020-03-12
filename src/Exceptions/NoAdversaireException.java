package Exceptions;

/**
 * Exception non-vérifiée
 */

public class NoAdversaireException extends RuntimeException{
    public NoAdversaireException(){
        super();
    }

    public NoAdversaireException(String m){
        super(m);
    }

}
