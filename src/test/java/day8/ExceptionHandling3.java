package day8;

public class ExceptionHandling3 {


    public static void main(String[] args) {
        System.out.println("Starting.......");
        try {
            String name = null;

            System.out.println(name.length());

        }
       /* catch (java.lang.NullPointerException npe){
            npe.printStackTrace();
        }*/
        finally {
            System.out.println("Closing connections");
        }
        System.out.println("Ending.....");

    }
}
