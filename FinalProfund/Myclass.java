
public class Myclass {
    public static void main(String[] args) {
        myclass myObj1 = new myclass();
        myclass myObj2 = new myclass();

        myclass.Mystatic = 999999;
        System.out.println(myObj2.Mystatic);
        
    }
}
class myclass {
    static int Mystatic;
    
    static int Mystatic(int value){
        Mystatic = value;
        return Mystatic;
    }
    
}
