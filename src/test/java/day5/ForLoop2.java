package day5;

public class ForLoop2 {

    public static void main(String[] args) {
        String names[]={"Diya","Ethan","Maria","Serah","Tedd","Tevin","Nevin","Tania"};
        for (int i=0;i<names.length;i++){

            System.out.println(names[i]);
            if (names[i]=="Tedd"){
                System.out.println("Found Tedd");
                break;
            }else
            {
                System.out.println("not found");
            }

        }
    }


}
