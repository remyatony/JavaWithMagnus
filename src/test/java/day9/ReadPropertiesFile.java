package day9;

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"config.properties";
        BufferedReader br =new BufferedReader(new FileReader(path));
        Properties prop =new Properties();
        prop.load(br);
       String value= prop.getProperty("url");

        System.out.println(value);
    }
}
