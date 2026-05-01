package RandomCodingExamples;

public class PrimeNumbers {

    public static String isPrime(int n){
        if(n <= 1) return n + " is Not Prime";

        for(int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return n + " is Not Prime";
            }
        }
        return n + " is Prime";
    }

    public static void main(String[] args) {
        int n=12;
        int n1=7;

        System.out.println(isPrime(n));
        System.out.println(isPrime(n1));

    }
}
