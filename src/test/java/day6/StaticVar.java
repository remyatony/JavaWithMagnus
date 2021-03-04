package day6;

public class StaticVar {
    static String sName="Rems";

    public static void main(String[] args) {
        System.out.println("The student name is "+sName);
        System.out.println("****************");
        sDetail();

    }

       public static void sDetail(){
        System.out.println("The student name is "+sName);
        System.out.println("This is a static method");


       }

}
