package pe.joedayz.samples2.ExceptionSamples;

public class MyFileReader implements AutoCloseable{

    private String tag;

    public MyFileReader(String tag) {
        this.tag = tag;
    }

    @Override
    public void close() throws Exception {
        System.out.println("closed "+tag);
    }
}
