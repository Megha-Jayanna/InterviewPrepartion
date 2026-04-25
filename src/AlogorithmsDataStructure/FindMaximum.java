package AlogorithmsDataStructure;

public class FindMaximum {

    public int findMax(int[] a) {

        int i, max = a[0];
        for (i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FindMaximum arr = new FindMaximum();
        int[] a = {1, 1, 2, 3, 5, 8,1000};
        System.out.println(arr.findMax(a));
    }
}
