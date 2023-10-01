import java.util.Scanner;
public class Lab7Q1660019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        fact = factorial(fact);
        System.out.println(fact);
        sc.close();
    }
    static int factorial(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }
}
