package pe.joedayz.nio;

import java.io.*;
import java.rmi.RemoteException;

public class Ejemplo implements Serializable {

   private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws IOException {
//        FileInputStream in = new FileInputStream("/home/ricardo/test/zoo.txt");
//        FileOutputStream out = new FileOutputStream("out.txt");
//        copyStream(in, out);
//        in.close();
//        out.close();
//
//        FileReader in2 =  new FileReader("/home/ricardo/test/zoo11.txt");
//        FileWriter out2 = new FileWriter("/home/ricardo/test/zoo22.txt");
//        copyStream2(in2, out2);
//        in2.close();
//        out2.close();
//      try(var fos = new FileOutputStream("/home/ricardo/test/zoo33.txt")){
//           for(int i = 0; i<10000;i++){
//               fos.write('a');
////               if(i %100 == 0){
////                   fos.flush();
////               }
//               if(i ==250) {
//                   throw new RuntimeException("x");
//               }
//           }
//      }



//        try(var fis = new FileInputStream("/home/ricardo/test/zoo.txt")){
//          // printData(fis);
//          //  fis.mark(10);
//            System.out.println((char)fis.read());
//            fis.skip(1);
//            System.out.println((char)fis.read());
//            fis.skip(1);
//            System.out.println((char)fis.read());
//            fis.reset();
//            System.out.println((char)fis.read());
//        }
        File f1 = new File("/home/ricardo/test/zooB1.txt");
        File f2 = new File("/home/ricardo/test/zooB2.txt");
        copyTextWithBuffer(f1,f2);
    }

    private static void printData(InputStream is) throws IOException {
        int b;
        while ((b = is.read()) != -1){
            System.out.println(b);
        }
    }

    static void copyStream(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1){
            out.write(b);
        }
    }

    static void copyStream(Reader in, Writer out) throws IOException {
        int b;
        while ((b = in.read()) != -1){
            out.write(b);
        }
    }

    static void copyTextWithBuffer(File src, File dest) throws IOException {
        try(var reader = new BufferedReader(new FileReader(src));
            var writer = new BufferedWriter(new FileWriter(dest)))
        {
                String s;
                while ((s= reader.readLine()) != null){
                    writer.write(s);
                    writer.newLine();
                }
        }
    }
}
