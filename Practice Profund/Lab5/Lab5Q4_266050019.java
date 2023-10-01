import java.util.Scanner;
public class Lab5Q4_266050019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int correct = 0;
        int wrong = 0;
        sc.close();
        for (int i = 0; i < text.length(); i++) {
            text = text.toLowerCase();
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                System.out.println("0");
                correct = 1;
                break;
            } 
            else {
                wrong = -1;
            }
        }
        if (wrong == -1 && correct != 1) {
            System.out.println("-1");
        }
    }
}