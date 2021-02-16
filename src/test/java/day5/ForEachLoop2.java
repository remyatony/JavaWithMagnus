package day5;

public class ForEachLoop2 {

    public static void main(String[] args) {
        String names[][]={
                {"Diya","Ethan","Maria","Serah","Tedd"},
                {"Tedd","Tevin","Nevin","Tania"}
        };
        for(String n1[]:names){
            for (String n2:n1){


                System.out.print(n2+" ");



            }System.out.println();
        }
    }
}
