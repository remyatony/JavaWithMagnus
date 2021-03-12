package day10;

import java.util.HashSet;
import java.util.Set;

public class SetHashSetExample {
    public static void main(String[] args) {

        Set<String> hs = new HashSet();

        hs.add("Reshmi");
        hs.add("Renu");
        hs.add("Remya");
        for (String values:hs){
            System.out.println(values);
        }
    }


}
