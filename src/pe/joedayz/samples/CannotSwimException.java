package pe.joedayz.samples;

public class CannotSwimException extends RuntimeException{

    public  CannotSwimException(){
        super();
    }

    public  CannotSwimException(Exception e){
       // super(e);
        super(e.getMessage());
    }

    public CannotSwimException(String message){
        super(message);
    }
}
