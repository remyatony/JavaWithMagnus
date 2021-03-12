package day9;

import java.io.*;
import java.sql.SQLOutput;

public class FileHAndling4 {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"TestData"+ File.separator+"demo3.txt";
        System.out.println(path);
       // FileOutputStream fos = new FileOutputStream(path);

        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        BufferedReader br = new BufferedReader(new FileReader(path));
        bw.write("Tedd");
        bw.newLine();
        bw.write("Rumiz");
        bw.newLine();
        bw.write("Sai");
        bw.newLine();
        bw.flush();
        bw.close();
        String name= "";
        while ((name = br.readLine())!=null){
            System.out.println(name);

        }



    }
}
