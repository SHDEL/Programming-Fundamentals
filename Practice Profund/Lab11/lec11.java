import java.lang.reflect.Array;
import java.util.ArrayList;

public class lec11 {
    public static void main(String[] args) {
        // demo5_charAndInt();
        // encrypted();
        demo7_Arraylist();
    }
    static void demo5_charAndInt(){
        char ch1 = 'a';
        char ch2 = 98;
        System.out.println(ch1 + " " + ch2 + " ");
        ch2 += 1;
        System.out.println(ch2);
        int n =(int)ch1;
        System.out.println(n);
    }
    static void encrypted(){
        String str = "kmitl";
        String ans = "";
        for ( int i = 0; i < str.length(); i++){
            int x = (str.charAt(i) + 1);
            char c = (char)x;
            ans += c;
        }
        System.out.println(ans);
    }
    static void demo7_Arraylist(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(65);
        list.add(72);
        System.out.println(list);
    }
    static void wrapper(){
       
    }
}
