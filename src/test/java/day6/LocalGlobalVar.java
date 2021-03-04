package day6;

public class LocalGlobalVar {

    int age =30;
    String name="Remya";
    public static void main(String[] args) {
        int i=10;
        String name="Anju";
    LocalGlobalVar obj = new LocalGlobalVar();
    obj.registration();
        System.out.println(name);

    }
    public void registration(){
        System.out.println("Name is "+name);
       // System.out.println(i);
    }
}
