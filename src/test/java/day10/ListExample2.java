package day10;

import java.util.ArrayList;

public class ListExample2 {
    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<String> l2 = new ArrayList<String>();
        l1.add("Reshmi");
        l1.add("Renu");
        l1.add("Remya");

        System.out.println(l1.get(1));
        l2.add("Diya");
        l2.add("Maria");
        l2.add("Tedd");

        l2.addAll(l1);
        for(int i=0;i<l2.size();i++) {
            System.out.println(l2.get(i));

        }

    }
}
