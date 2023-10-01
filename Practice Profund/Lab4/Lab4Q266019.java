import java.util.Scanner;

public class Lab4Q266019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price1: ");
        int price1 = sc.nextInt();
        System.out.print("Enter price2: ");
        int price2 = sc.nextInt();
        System.out.print("Enter price3: ");
        int price3 = sc.nextInt();
        sc.close();

        int[] prod = { price1, price2, price3 };
        for (int i = 0; i < prod.length; i++) {
            for (int j = i + 1; j < prod.length; j++) {
                int tmp = 0;
                if (prod[i] > prod[j]) {
                    tmp = prod[i];
                    prod[i] = prod[j];
                    prod[j] = tmp;
                }
            }
        }
        int sum = prod[1] + prod[2];
        System.out.println("The price is: " + sum);
    }
}
