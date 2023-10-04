public class ProFun12_Person_Main {
    public static void main(String[] args) {
        demo_1_initialobject();
        demo_2_interaction_equal();
        demo_3_more_interact();
    }
    static void demo_3_more_interact(){
        System.out.println("---person's saving change---");
        Person yd1 = new Person("yindee", 2000);
        Person pd = new Person("Preeda", 1000);
        yd1.reward(pd, 400);
        System.out.println(yd1);
        System.out.println(pd);
    }
    static void demo_2_interaction_equal(){
        System.out.println("---object interaction---");
        Person yd1 = new Person("yindee", 2000);
        Person pd = new Person("Preeda ", 1000);
        System.out.println(yd1.isWeather(pd));

        Person yd2 = new Person("yindee", 2000);
        System.out.println("test on differents address" + (yd1 == yd2));
        System.out.println(".equals() " + yd1.equals(yd2));
        System.out.println(".equals() " + yd2.equals(yd1));
        System.out.println(".equals() " + yd1.equals(pd));
    }
    static void demo_1_initialobject(){
        System.out.println("---new and toString---");
        Person yd = new Person("yindee", 2000);
        Person pd = new Person("Preeda", 1000);
        yd.introduce_self();
        pd.introduce_self();
        System.out.println(yd);
        System.out.println(pd);
    }
    
}