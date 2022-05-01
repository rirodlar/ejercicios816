package pe.joedayz.samples2.ExceptionSamples;

public class JammedTurkeyCage implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) throws Exception {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            //throw new IllegalStateException("turkeys ran off");
        }catch (IllegalStateException e){
            System.out.println("Caught :"+e.getMessage());

            for(Throwable t: e.getSuppressed()){
                System.out.println("Suppresed: "+t.getMessage());
            }
        }

    }
}

