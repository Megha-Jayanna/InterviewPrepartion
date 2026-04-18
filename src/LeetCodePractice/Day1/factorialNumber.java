package LeetCodePractice.Day1;


public class factorialNumber {
    int factNum(int n) {
//        if (n <= 1) {
        if (n == 1) {
            return 1;
        } else {
            return n * factNum(n - 1);
        }
    }
    int fibonacci(int a){

        if(a==1 || a==2){
            return 1;
        }else{

            return fibonacci(a-1)+ fibonacci(a-2);
        }
    }
    public static void main(String[] args) {
        factorialNumber f = new factorialNumber();
        System.out.println(f.factNum(3));
        System.out.println(f.fibonacci(6));
    }
}