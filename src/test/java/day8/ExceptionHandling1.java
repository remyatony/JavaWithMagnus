package day8;

public class ExceptionHandling1 {
    //Run time exception
    // Arithmetic exception
    public static void main(String[] args) {
        System.out.println("Starting.......");
        try {
            int x=10;
            int y=0;
            double div = x/0;
            System.out.println(div);
        } catch (ArithmeticException ae){
            System.out.println("Exception detected :"+ ae.getMessage());
        }

        System.out.println("Ending.....");


    }
}
