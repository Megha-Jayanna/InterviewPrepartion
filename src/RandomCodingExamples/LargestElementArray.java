package RandomCodingExamples;

import java.util.Arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] n= {10,20,30,10,20,30,30,40,40,50,40,1000,40,40,40};
        int largest= n[0];

        for(int i=0; i < n.length; i++){
            if(n[i] > largest){
                largest= n[i];
            }
        }
        System.out.println("Largest element: " + largest);

        int mostFre= n[0];
        int mostCount=0;

        for(int i=0 ; i<n.length; i++){
            int count=0;
            for(int j=0;j<n.length;j++){
                if(n[i] == n[j]){
                    count ++;
                }
            }
            if(count> mostCount){
                mostCount=count;
                mostFre=n[i];
            }
        }
        System.out.println("Most Fre Num: "+ mostFre);
        System.out.println("Most count Num: "+ mostCount);
    }
}
