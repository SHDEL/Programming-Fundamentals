class ExampleStatic {

    private int nonStaticVariable;
    private static int staticVariable;

    public static void staticMethod() {   
        nonStaticVariable = 999;// (1)
         staticVariable = 9999;
    }
    public void nonStaticMethod() {
         nonStaticVariable = 999;
         staticVariable = 9999;
    }
    public static void main(String[] args) {
         nonStaticVariable = 999;// (2)   
         staticVariable = 9999;
         nonStaticMethod();// (3)
         staticMethod();
    }
}