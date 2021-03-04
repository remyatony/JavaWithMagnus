package day10;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        String[] names = {"Maria","Serah","Ethan","Diya","Tedd"};
       for(String n:names) {
           System.out.print(n+" ");
       }
       System.out.println();
        Arrays.sort(names);
        for(String n2:names)
        System.out.print(n2+" ");
    }
}
