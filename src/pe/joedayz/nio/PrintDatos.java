package pe.joedayz.nio;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintDatos {
    public static void main(String[] args) throws FileNotFoundException {

       Console c = System.console();

       c.writer().println("Welcomes ZOO");
       c.format("It has %d animals", 345);
       c.printf("The zoo");
//        try(PrintWriter out  = new PrintWriter("zoo.log")){
//            out.write(String.valueOf(7));
//            out.print(8);
//
//           // System.getProperties("line.seperator");
//        }
    }
}
