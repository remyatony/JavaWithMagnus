package day9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "demo.txt";

        System.out.println(path);

       /* File file = new File(path);
        FileWriter fw =new FileWriter(path);
        BufferedWriter bf = new BufferedWriter(fw);

*/
        BufferedWriter bf = new BufferedWriter(new FileWriter(path));
        bf.write("Remya");
        bf.newLine();
        bf.write("Tedd");
        bf.newLine();
        bf.write("Serah");
        bf.flush();
        bf.close();

    }
}
