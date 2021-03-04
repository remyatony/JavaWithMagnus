package day6;

public class LearnConstructor {
    LearnConstructor(){

        System.out.println("in constructor");
    }
    LearnConstructor(int a){
        System.out.println("in parameterized constructor");

    }
    public static void main(String[] args) {

        LearnConstructor lC= new LearnConstructor();
        LearnConstructor lCp=new LearnConstructor(10);
    }

}
