class Movie {
    String title;
    int releasedYear;
    double rating;
    Movie(String name, int year, double rate){
        title = name;
        releasedYear = year;
        rating = rate;
    }

    String getTitle(String name){
        title = name;
        return title;
    }
    int getReleasedYear(int year){
        releasedYear = year;
        return year;
    }
    double getRating(double rate){
        rating = rate;
        return rating;
    }
    
    @Override
    public String toString() {
        return "Movie [title=" + title + ", releasedYear=" + releasedYear + ", rating=" + rating + "]";
    }
    
    
}
