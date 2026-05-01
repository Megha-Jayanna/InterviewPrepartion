package RandomCodingExamples;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=1535;
        int tmp=n;
        int sum=0;
        int digit= String.valueOf(n).length();
        System.out.println("Enterted Number: "+ n);
        while(n>0){
            int digits = n % 10;
            sum += Math.pow(digits,digit);
            n /= 10;
        }
        System.out.println("Total Sum: "+sum);

        if(tmp == sum) {
            System.out.println("ArmstrongNumber");
        }else {

            System.out.println("Not a ArmstrongNumber");
        }
    }
}
