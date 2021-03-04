package day9;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "demo.txt";

        System.out.println(path);

        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File Created");
        } else {

            System.out.println("File Exists");
        }

    }
}
