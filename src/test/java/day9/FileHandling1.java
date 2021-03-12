package day9;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "demo.txt";
        String path2=System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "demo2.txt";
        System.out.println(path2);
       // long l= System.currentTimeMillis();
       // System.out.println("l= "+l);
        File file = new File(path);


        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File Created");
        } else {
            System.out.println("File Exists");
        }



    }
}
