package AlogorithmsDataStructure;

import java.sql.DriverManager;

//compute the average of the array values
public class FindAverage {
    public double avg(int[] a){
        int i,sum=0;
        for(i=0;i<a.length;i++){
            sum +=a[i];
        }
        return (double) sum / a.length;
    }
    public static void main(String[] args) {
        FindAverage f=new FindAverage();
        int[] a= {4,2,4,6};
        System.out.println(f.avg(a));
        int[] a1= {5,5};
        System.out.println(f.avg(a1));
    }
}
