package pe.joedayz.nio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
            Gorilla g1 = new Gorilla("g1","t1");
            Gorilla g2 = new Gorilla("g2","t2");
            File file = new File("/home/ricardo/test/gorillasV2.txt");

//       saveToFile(List.of(g1,g2), file);
        readFromFile(file);
       List<Gorilla> gorillaList =  readFromFile(file);
        for (Gorilla g: gorillaList) {
            System.out.println(g.name);
        }
    }
    //serilizar
    static void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {
        try(var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))){
          for(Gorilla g: gorillas) {
              out.writeObject(g);
          }
        }
    }

    //leer el fichero - ObjectInputStream
    //deserializar
    static List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        ArrayList<Gorilla> gorillas = new ArrayList<>();
        try(var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))){
            while (true){
                var object = in.readObject();
                if(object instanceof Gorilla){
                    gorillas.add((Gorilla) object);
                }

            }
        }catch (EOFException e){
            System.out.println("File end reached");
        }
        return gorillas;
    }
}
