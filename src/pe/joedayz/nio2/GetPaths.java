package pe.joedayz.nio2;


import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetPaths {
    public static void main(String[] args) throws URISyntaxException {
//        Path path = Path.of("pandas/cuddly");
//        //Path path1 = FileSystems.getDefault("");
//           Paths.get("pandas/cuddly");
//
//        URI a = new URI("file://uce.txt");
//
//        File file = new File("husky.png");
//        Path path1 = file.toPath();
//        File file1 = path1.toFile();

        Path path = Paths.get("mammal/ommvirre/raconn.image");
        System.out.println("The path is "+ path);

        for (int i = 0 ; i< path.getNameCount(); i++){
            System.out.println(" Element "+i+" is: "+ path.getName(i));
        }

        System.out.println( path.subpath(0,3));

        System.out.println(path.getParent());
        System.out.println(path.isAbsolute());
        Path nuevoPath = path.toAbsolutePath();
        System.out.println(nuevoPath);

        System.out.println(path.resolve(nuevoPath));

        System.out.println("-----------");
        var path1 = Path.of("fish.xt");
        var path2 = Path.of("friendly/bids.txt");

        System.out.println(path1.relativize(path2));

        System.out.println(path2.relativize(path1));

    }
}
