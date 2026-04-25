package AlogorithmsDataStructure;

import java.util.Arrays;

//copy to another array
public class CopyToAnother {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b= new int[a.length];
        int i;
//        int[] b = Arrays.copyOf(a, a.length);
//        System.out.println(Arrays.toString(b));
        for(i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("Origina: "+ Arrays.toString(a));
        System.out.println("Origina: "+ Arrays.toString(b));

    }
}
