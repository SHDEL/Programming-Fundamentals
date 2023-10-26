
public class varargs {
    public static void main(String[] args) {
        doSomething("Hello", "World");
        String [] strs = {"apple", "orange"};
        doSomething(strs);
    }
    public static void doSomething(String... strs){
        System.out.print("Arguments : ");
        for (String str : strs){
            System.out.print(str + ", ");
            
        }
        System.out.println();
    }
    

}
