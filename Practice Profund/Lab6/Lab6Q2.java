import java.util.Scanner;
public class Lab6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] str1 = input.split(" ");
        int cnt = 0;
        int [] num = new int [str1.length];
        sc.close();
        for (int j = 0; j < str1.length; j++){
            num[j] = Integer.parseInt(str1[j]);
        }
        for (int i = 0; i < num.length - 1; i++){
            if (num[i] == num[i + 1] ){
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }
    
}
