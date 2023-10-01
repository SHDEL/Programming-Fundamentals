import java.util.Arrays;

public class Lab8_660019 {
    public static void main(String[] args) {
        int [] data = {-2,-3,4,-1,-2,1,5,-3};
        // q2_1_BF(data);
        // q2_2_kadane(data);
        q3_topK(5,3,8,4,10,3,1,5,9,7,2,3,0);
    }
    static void q2_1_BF(int ... data) {
        int max = Integer.MIN_VALUE;
        int sum ;
        int start, stop;
        start = stop = 0;
        int numCases = 0;
        //all pair of i,j
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j < data.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++){
                    sum += data[k];
                }
                // sum += data[j];
                
                System.out.printf("case %d for start,stop = %d,%d ->  sum = %d",++numCases,i,j,sum);
                if (sum > max) {
                    start = i;
                    stop = j;
                    max = sum;
                    System.out.println(" ** new max **");
                } else {
                    System.out.println();
                }
            }
        }
        System.out.printf("%d %d = %d%n",start,stop,max);
    }
    static void q2_2_kadane(int ... data) {
        int start, stop;
        start = stop = 0;
        int max_so_far = Integer.MIN_VALUE;
        int max_ends_here = 0;
        int forward = 0;

        for (int i = 0; i < data.length; i++) {
            max_ends_here += data[i]; 
            if (max_so_far < max_ends_here) { 
                max_so_far = max_ends_here;
                start = forward;
                stop = i;
                System.out.printf("%d %d is new max = %d%n",start,stop,max_so_far); 
            }
            if (max_ends_here < 0) { 
                max_ends_here = 0;
                forward = i + 1;

                                    // fast forword i to skip all subset of ending at j
                                    // ignore negative sum 
            }            
        }
        System.out.printf("%d %d = %d%n",start,stop,max_so_far);
    }
    static void q3_topK(int ... data) {
        
        int[] intArr = new int[10];
        // intArr = data;
        for (int i = 1; i < intArr.length; i++){
            int k = i;
            if(k == intArr.length - 1){
               intArr[k - 1] = data[k + 1];
            }
            if (intArr[0] == 0){
                intArr[0] = data[0];
            }
            intArr[i] = data[i];
            int tmp = intArr[i];
            int j = i - 1;
            if (intArr[i] <= 0){
                break;
            }
            while (j >= 0 && intArr[j] < tmp){
                intArr[j + 1] = intArr[j];
                j--;
            }
            intArr[j + 1] = tmp; 
            System.out.print("insert " + data[i]+ ": ");
            System.out.println(Arrays.toString(intArr));
        }
    }
}
