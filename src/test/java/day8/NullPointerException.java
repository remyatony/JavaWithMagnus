package day8;

public class NullPointerException extends Throwable {

    //Run Time Exception
    //Null pointer exception

    public static void main(String[] args) {
        System.out.println("Starting.......");
        try {
            String name = null;

            System.out.println(name.length());

        } catch (java.lang.NullPointerException npe){
            npe.printStackTrace();
        } catch (ArithmeticException ae){
            ae.printStackTrace();
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        System.out.println("Ending.....");

    }
}
