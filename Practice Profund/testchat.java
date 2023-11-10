import java.util.Arrays;

public class testchat {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 1, 5, 6};
        int[] lane = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < lane.length; j++) {
                if (arr[i] > lane[j]) {
                    int k = j;
                    while (k > 0 && lane[k - 1] == 0) {
                        lane[k] = lane[k - 1];
                        k--;
                    }
                    lane[k] = arr[i];
                    break;
                }
            }
            System.out.println(Arrays.toString(lane));
        }
    }
}
