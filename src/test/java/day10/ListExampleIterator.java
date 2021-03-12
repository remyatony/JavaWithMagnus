package day10;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExampleIterator {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<String> l2 = new ArrayList<String>();
        l1.add("Reshmi");
        l1.add("Renu");
        l1.add("Remya");
        l2.add("Diya");
        l2.add("Maria");
        l2.add("Tedd");
        l2.addAll(l1);
        for (String name : l2) System.out.println(name);

        System.out.println("*************");

        Iterator it = l2.iterator();

       while(it.hasNext()){
           System.out.println(it.next());

       }


    }
}
