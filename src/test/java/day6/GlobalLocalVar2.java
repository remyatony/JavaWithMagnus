package day6;

public class GlobalLocalVar2 {
    String city = "SFO";

    public static void main(String[] args) {
        GlobalLocalVar2 globLoc = new GlobalLocalVar2();
        globLoc.studentDetails("Rems");

    }

    public void studentDetails(String SName) {

        System.out.println("The name of the student is " + SName);

        System.out.println(SName + " is from " + city);
    }

    public void university() {
        System.out.println("The is not a static method");
    }


}

