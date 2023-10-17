
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class ProFun13_ReadCSV660019 {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();
        // demo4();
    }
    static void demo1(){
        System.out.println("--demo1--");
        try (Scanner input = new Scanner(Paths.get("movies.csv"));) {
            // System.out.printf("%-15s %-12s %-12s %n ","Title", "Released", "Rating");
            while (input.hasNext()){
                String row = input.nextLine();
                // String [] tokens = row.split(",");
                // String title = tokens[0];
                // int release = Integer.parseInt(tokens[1]);
                // double rate = Double.parseDouble(tokens[2]);
                System.out.println(row);
                // System.out.printf("%-15s %-12d %-12.2f %n", title, release, rate);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.printf("I/O Error: %s%n", e);
            e.printStackTrace();
        }
    }
    static void demo2(){
        System.out.println("\n--demo2--");
        try (Scanner input = new Scanner(Paths.get("movies.csv"));) {
            while (input.hasNext()){
                String row = input.nextLine();
                String [] tokens = row.split(",");
                String title = tokens[0];
                int release = Integer.parseInt(tokens[1]);
                double rate = Double.parseDouble(tokens[2]);
                
                Movie movie = new Movie(title, release, rate);
                System.out.println(movie);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.printf("I/O Error: %s%n", e);
            e.printStackTrace();
        }
       
    }
    static void demo3(){
        System.out.println("\n--demo3--");
        int rownum = 0;
        try (Scanner input = new Scanner(Paths.get("movies2.csv"));) {
            while (input.hasNext()){
                try {
                    String row = input.nextLine();
                    String [] tokens = row.split(",");
                    String title = tokens[0];
                    int release = Integer.parseInt(tokens[1]);
                    double rate = Double.parseDouble(tokens[2]);
                    Movie movie = new Movie(title, release, rate);
                    // System.out.println(movie);
                    rownum++;
                }
                catch (Exception e){
                    System.out.println("At row" + rownum + ", exception named " + e + "...skip");
                    continue;
                }
            }
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("At row" + rownum + ", exception named " + e + "...skip");
        }

    }
    static void demo4(){
        ArrayList <Movie> availableList = new ArrayList<>();
        System.out.println("\n--demo4--");
        try (Scanner input = new Scanner(Paths.get("movies2.csv"));) {
            while (input.hasNext()){
                String row = input.nextLine();
                String [] tokens = row.split(",");
                try {
                    String title = tokens[0];
                    int release = Integer.parseInt(tokens[1]);
                    double rate = Double.parseDouble(tokens[2]);
                    Movie movie = new Movie(title, release, rate);
                    availableList.add(movie);
                }
                catch (Exception e){
                    // System.out.println("At row" + rownum + ", exception named " + e + "...skip");
                    continue;
                }
            }
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        for (Movie movie : availableList){
            System.out.println(movie);
        }
    }
}