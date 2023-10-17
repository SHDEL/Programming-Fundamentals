import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class MovieCounter_660019 {
    ArrayList<Movie> availableList = new ArrayList<Movie>();
    ArrayList<Movie> checkOutList = new ArrayList<Movie>();
    public static void main(String[] args) {
        MovieCounter_660019 location1 = new MovieCounter_660019();
        MovieCounter_660019 location2 = new MovieCounter_660019();
        location1.readCSV();
        location2.readCSV();
        
        System.out.println("location 1");
        location1.showAvailabeList();
        System.out.println("location 2");
        location2.showAvailabeList();

        System.out.println("\nlocation 1");
        location1.checkOut(1);
        location1.showCheckOutList();
        location1.showAvailabeList();

        System.out.println("\nlocation 2");
        location2.checkOut(2);
        location2.showCheckOutList();
        location2.showAvailabeList();
    }

    void readCSV() {
        int rowNum = 0;
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
            while (input.hasNext()) {
                String row = input.nextLine();
                String[] tokens = row.split(",");
                try {
                    String title = tokens[0];
                    int releasedYear = Integer.parseInt(tokens[1]);
                    double rating = Double.parseDouble(tokens[2]);
                    Movie movie = new Movie(title, releasedYear, rating);
                    availableList.add(movie);
                } catch (Exception e) {
                    System.out.println("At row " + rowNum + ", exception named " + e + "... skip");
                    continue;
                }
                rowNum++;
            }
        } catch (Exception e) {
            System.out.println("At row " + rowNum + ", exception named " + e + "... skip");
        }
    }

    void showAvailabeList() {
        System.out.println("The following titles are available.");
        for (int i = 0; i < availableList.size(); i++) {
            System.out.println(availableList.get(i));
        }
    }

    void showCheckOutList() {
        for (int i = 0; i < checkOutList.size(); i++) {
            System.out.println(checkOutList.get(i));
        }
    }

    void checkOut(int idx) {
        System.out.println("The following titles have been checked out. " + availableList.get(idx));
        checkOutList.add(availableList.get(idx));
        availableList.remove(idx);
    }
}
