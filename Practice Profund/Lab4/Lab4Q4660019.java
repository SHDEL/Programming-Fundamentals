import java.util.Scanner;

public class Lab4Q4660019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int num = 0;

        System.out.print("How many perfect number do you want: ");
        int input = sc.nextInt();
        sc.close();
        while (cnt <= input) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                /* If i is a divisor of num */
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num && num > 0) {
                System.out.println("(k = " + cnt + ") : " + num);
                cnt++;
            }
            num++;
        }
    }
}
