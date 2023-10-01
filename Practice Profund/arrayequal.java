public class arrayequal {
    public static void main(String[] args) {
        int data1 [] = {1, 6, 10, 7, 14, 6};
        int data2 [] = {14, 10, 7, 6, 1, 4};
        boolean value = equality(data1, data2);
        System.out.println(value);

    }
    static boolean equality(int [] arr1, int [] arr2){
        int cnt = 0;
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
        if (cnt == arr1.length && cnt == arr2.length){
            return true;
        }
        else{
            return false;
        }
        
    }
}
