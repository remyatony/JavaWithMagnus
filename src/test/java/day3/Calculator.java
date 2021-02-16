package day3;

public class Calculator {
    public static void main(String[] args) {

 Calculator calc =new Calculator();
         calc.addition(20,10);
        calc.addition(10,20,30);

    }

    public void addition(int a, int b){
       int sum=a+b;
        System.out.println("Sum = "+ sum);
 }
    public void addition(int a, int b, int c){
        int sum=a+b+c;
        System.out.println("Sum = "+ sum);
    }
}
