package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListExample5ListIterator {
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



        ListIterator li = l2.listIterator();


        while (li.hasNext()){

            System.out.println(li.next());

        }

        System.out.println("*************");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        }
}
