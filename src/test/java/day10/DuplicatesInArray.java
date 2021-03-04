package day10;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] num={123,234,112,123,345,234,456,345} ;
        for(int i=0;i<num.length;i++){

            for (int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println(num[j]);


                }
            }

        }

    }
}
