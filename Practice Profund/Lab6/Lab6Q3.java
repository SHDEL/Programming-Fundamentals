import java.util.Scanner;
public class Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        System.out.println(input.replace("MI", "CSP"));
    }
}
