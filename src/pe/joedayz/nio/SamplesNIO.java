package pe.joedayz.nio;


import java.io.File;

public class SamplesNIO {
    public static void main(String[] args) {

        try(var out = System.out){}
        System.out.println("Hello");

        System.out.println(System.getProperty("file.separator"));
        System.out.println(File.separator);

        var zooFile1 = new File("/home/ricardo/data/stripe.txt");
        var zooFile2 = new File("/home/ricardo", "data/stripe.txt");
        File parent = new File("/home/ricardo");
        File zooFile3 = new File(parent, "data/stripex.txt");

        System.out.println(zooFile1.exists());


    }
}
