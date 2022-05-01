package pe.joedayz.samples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Base64 {

    public static void main(String[] args) {

     //   StringUtils.getBytesUtf8("base64");

        String x=  "WNJBAWJ0R333";
        String pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(x);
        if (m.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


}
