package DSA;

public class HeapSortExample {
    public static void main(String[] args) {
        int ar[]= {10,4,5,3,1};
        heapsort(ar);
        for (int n: ar){
            System.out.println(n);
        }
    }

    private static void heapsort(int[] ar) {
        int n=ar.length;
        for(int i= n/2 - 1; i>=0; i--){
            heapify(ar,n,i);
        }
        for(int i= n-1; i>0; i--){
            int tmp= ar[0];
            ar[0]= ar[i];
            ar[i]=tmp;
            heapify(ar,i,0);
        }
    }

    private static void heapify(int[] ar, int n, int i) {

        int maximum= i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && ar[left] > ar[maximum]){
            maximum=left;
        }
        if(right < n && ar[right] > ar[maximum]){
            maximum=right;
        }

        if(maximum !=i){
            int tmp=ar[i];
            ar[i]=ar[maximum];
            ar[maximum]= tmp;

            heapify(ar,n,maximum);
        }
    }


}
