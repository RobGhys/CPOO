package Exceptions;

/**
 * Exception vérifiée
 */

public class NotSortedException extends Exception{
    public NotSortedException(){
        super();
    }
    public NotSortedException(String a){
        super(a);
    }
}
