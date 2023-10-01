/**
 * Lab7Q2_1
 */
import java.util.Scanner;
public class Lab7Q2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc .nextLine();
        String input_2 = sc.nextLine();
        boolean output_1 = isRotationOff(input , input_2);
        System.out.println("output: " + output_1);
        sc.close();
    }
    static boolean isRotationOff(String str1, String str2){
        boolean x = false;
        int cnt = 0;
        int cntf = 0;
        for (int i = 0; i < str2.length(); i++){
            for (int j = 0; j < str1.length(); j++){
                if (str2.charAt(i) == str1.charAt(j)){
                    cnt++;
                    cntf = 0;
                    break;
                }
                else{
                    cntf++;        
                }
            }
        }
        System.out.println("Count: " + cnt);
        System.out.println("CountFalse: " + cntf);
        if (cntf > 0) {
            x = false;
        }
        else if (cnt <= str1.length() && cnt > 0){
            x = true;
        }
        
        return x;

    }
}