package AlogorithmsDataStructure;

import java.util.Arrays;

public class ProductsExample {
    public int product(int[] a){
        int prd = a[0];
        for(int i = 1; i<a.length;i++)
        {
            prd *= a[i];
        }
        return prd;
    }
    public static void main(String[] args) {
        ProductsExample p= new ProductsExample();
        int[] a={1,2,3};
        System.out.println(Arrays.toString(a));
        System.out.println(p.product(a));
    }
}
