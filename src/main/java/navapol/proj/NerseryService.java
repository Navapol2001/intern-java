package navapol.proj;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class NerseryService {
    public void enter(Animal a) throws IOException {
        //a.live();
        String name = a.live();
        System.out.println("yo" + name);
         /*
        IO steam
        1. byte steam
        2. char steam
         */
        File file = new File("test2.txt");
//        OutputStream out = null;
//        //OutputStream out = new FileOutputStream(file);
//        //out.write(name.getBytes(StandardCharsets.UTF_8));
//        //out.close();
//        try {
//            out = new FileOutputStream(file);
//            byte[] bytes = name.getBytes(Charset.forName("UTF-8"));
//            out.write(bytes);
//        } finally {
//            if (out!= null) {
//                out.close();
//            }
//        }
        try (OutputStream out = new FileOutputStream(file)) {
            byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
            out.write(bytes);
            //out.close();
        }
    }
}
