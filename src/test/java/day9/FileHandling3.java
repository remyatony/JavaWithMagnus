package day9;

import java.io.*;

public class FileHandling3 {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "demo.txt";

        System.out.println(path);
        BufferedReader br =new BufferedReader(new FileReader(path));
       // String l1=br.readLine();
        String x ="";
        while((x=br.readLine())!=null){
            System.out.println(x);
        }
       // System.out.println(l1);

    }
}
