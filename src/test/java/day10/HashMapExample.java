package day10;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {


        HashMap<String,String> sdetails = new HashMap<String,String>();
        sdetails.put("name","Remya");
        sdetails.put("place","sfo");
        for (Map.Entry<String,String>n: sdetails.entrySet()){
            System.out.println(n);
        }
    }
}
