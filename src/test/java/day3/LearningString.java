package day3;

import java.util.Objects;

public class LearningString {
    public static void main(String[] args) {

        String country ="     india  is my country    ";
       int l= country.length();
       System.out.println(l);
        System.out.println(country.toUpperCase());
        System.out.println(country.toLowerCase());
        System.out.println(country.charAt(2));
        System.out.println(country.replace('i','!'));
        System.out.println(country.trim());
       // System.out.println(country());
        String name= "Remya";
        System.out.println( name.equals("remya"));
        System.out.println(name.equalsIgnoreCase("remya"));
        System.out.println(name.contains("em"));

    }
}
