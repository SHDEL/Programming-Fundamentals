import java.util.Scanner;
public class Lab6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        boolean x;
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int j = 0; j < arr.length; j++){
            if (j == arr.length - 1){
                x = true;
                System.out.println(x);
                break;
            }
            else if (arr[j] > arr[j + 1]){
                x = false;
                System.out.println(x);
                break;
            }
        }
    }
}
