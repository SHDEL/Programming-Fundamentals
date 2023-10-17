import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class ProFun13_ReadCSVxxyyyy {
    public static void main(String[] args) {
        demo1();
    
    }
    static void demo1(){
        try (Scanner input = new Scanner(Paths.get("movies.csv"));) {
            System.out.printf("%-15s %-12s %-12s %n ","Title", "Released", "Rating");
            while (input.hasNext()){
                String row = input.nextLine();
                String [] tokens = row.split(",");
                String title = tokens[0];
                int release = Integer.parseInt(tokens[1]);
                double rate = Double.parseDouble(tokens[2]);
                System.out.printf("%-15s %-12d %-12.2f %n", title, release, rate);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.printf("I/O Error: %s%n", e);
            e.printStackTrace();
        }
    }
    static void demo2(){
        
    }
}