
public class wordchain {
    public static void main(String[] args) {
        String [] str = {"HEAD", "HEAP", "LEAP", "TEAR", "REAR", "BARE",
        "BAET", "BEEP", "JEEP", "JOIP", "JEIP", "AEIO"};
        System.out.println(lastInChain(str));

    }
    static String lastInChain(String [] strArr){
        for (int i = 0; i < strArr.length - 1; i++){
            int cnt = 0;
                for (int j = 0; j < strArr[i].length(); j++){
                    if (strArr[i].charAt(j) != strArr[i + 1].charAt(j)){
                        cnt++;
                    }
                }
                if (cnt > 2){
                    return strArr[i];
                }
        }
        return "";
    }
}
