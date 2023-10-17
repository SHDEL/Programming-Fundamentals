import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab13Q3 {
    public static void main(String[] args) {
        ArrayList <Movie> availableList = new ArrayList<>();
        readcsv(availableList);
        for (Movie movie : availableList){
            System.out.println(movie);
        }
        MovieCounter_660019 location1 = new MovieCounter_660019();
        ArrayList <Movie> checkOutList = new ArrayList<>();
    }
    static ArrayList readcsv(ArrayList arr){
        
        try (Scanner input = new Scanner(Paths.get("movies2.csv"));) {
            while (input.hasNext()){
                try {
                    String row = input.nextLine();
                    String [] tokens = row.split(",");
                    String title = tokens[0];
                    int release = Integer.parseInt(tokens[1]);
                    double rate = Double.parseDouble(tokens[2]);
                    Movie movie = new Movie(title, release, rate);
                    arr.add(movie);
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
        return arr;
        
    }
}
