
public class Lab5Q4_166050019 {
    public static void main(String[] args) {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int countM = 0;
        int countW = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'M'){
                countM++;
            }
            else{
                countW++;
            }
        }
        System.out.println("Men: " + countM + "\n" + "Woman: " + countW);
    }
}