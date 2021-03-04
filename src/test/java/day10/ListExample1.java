package day10;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {

     //   List<String> l1 = new ArrayList<String>();
        ArrayList<String> l2= new ArrayList<String>();
        l2.add("Hello");
        l2.add("Reshmi");
        l2.add("Renu");
        l2.add("Remya");
        System.out.println(l2.get(1));
        l2.remove(0);
        System.out.println(l2.get(0));
        int i= l2.size();
        System.out.println(i);
    }
}
