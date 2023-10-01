import java.util.Arrays;

public class ProFun10_660019 {
    public static void main(String[] args) {
        // q1
        int a [] = {1, 2, 3};
        q1_appearsIn(a, 3);

        //q2
        int arrq2[] = {1,2,3,2,4,2};
        int q2 = occurrences(arrq2, 2, 0);
        System.out.println(q2);

        //q3
        int data[] = {1, -2, 3, 4, -5};
        int arr[] = q3_negativeToZero(data, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static boolean q1_appearsIn (int [] a , int n){
        boolean isFound = appearsIn(a, n, 0);
        System.out.println(isFound);
        return isFound;
    }
    static boolean appearsIn(int[] a, int n, int idx){
        if (idx == a.length){
            return false; 
        }  
        if (a[idx] == n){
            return true; 
        }  
        return appearsIn(a, n, idx + 1);
    }
    public static int occurrences(int[] a, int n, int idx){
        if (idx == a.length){
            return 0;
        }
        if (a[idx] == n){
            return 1 + occurrences(a, n, idx + 1);
        }
        return occurrences(a, n, idx + 1);
    }
    public static int [] q3_negativeToZero(int [] arr , int idx){
        if (idx == arr.length){
            return arr;
        }
        if (arr[idx] < 0){
            arr[idx] = 0;
        }
        q3_negativeToZero(arr, idx + 1);
        return arr;
    }
   
}
