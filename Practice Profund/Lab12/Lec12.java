public class Lec12 {
    public static void main(String[] args) {
        Student n1 = new Student();
        n1.getName("Yindee");
        System.out.println(n1.name);
        n1.setGpa(3.93);
        System.out.println(n1.gpa);
        System.out.println(n1.toString());
    }
}
class Student {
    String name;
    double gpa;

    String getName(String input){
        name = input;
        return name;
    }
    double setGpa(double num){
        gpa = num;
        return gpa;
    }
    @Override
    public String toString() {
        return "Student[name = " + name + ",gpa = " + gpa + "]";
    }
}

