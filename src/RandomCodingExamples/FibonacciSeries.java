package RandomCodingExamples;

public class FibonacciSeries {
    public static void main(String[] args) {
    int n=5;
    int first=0, second=1;
        System.out.println("Fibonacci Series up to " + n);
    for(int i=1; i<=n; i++){
        System.out.println(first + " ");
        int next = first + second;
        first =second;
        second= next;
    }

    }
}
