package test;
import java.util.Arrays;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input [] = new int[n];
        for (int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }
        int lane [] = new int[4];
        for (int i = 0; i < lane.length; i++){
            lane[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(lane));
        q3(input, lane);
        
    }
    static void q3(int [] arr, int [] lane) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < lane.length; j++) {
                if (arr[i] > lane[j]) {
                    int k = j;
                    if (k != 0){
                        while (k > 0 && lane[k - 1] > lane[k]) {
                            lane[k] = lane[k - 1];
                            k--;
                        }
                    }
                    else{
                        lane[k] = arr[i];
                        break;
                    }
                }
                else{
                    break;
                }
            }
        System.out.println(Arrays.toString(lane));   
        }
    }
}
