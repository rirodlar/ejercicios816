package pe.joedayz.nio;

import java.io.*;
import java.nio.charset.Charset;

public class MetodosFile {

    public static void main(String[] args) throws FileNotFoundException {
        Charset charset1 = Charset.forName("US-ASCII");
        Charset charset2 = Charset.forName("UTF-8");

      var x=   new BufferedInputStream(new FileInputStream("x.txt"));

        var file = new File("/home/ricardo");
        System.out.println(file.exists());

        if(file.exists()){
            System.out.println(file.getAbsoluteFile());
            System.out.println("is Directory: "+ file.isDirectory());
            System.out.println(" Parent :" +file.getParent());

            if(file.isFile()){
                System.out.println("last modified :"+file.lastModified());
            }else{
                for(File subFile: file.listFiles()){
                    System.out.println(subFile.getName());
                }
            }

        }
    }
}
