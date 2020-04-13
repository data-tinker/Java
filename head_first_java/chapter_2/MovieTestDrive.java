class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -1;

        System.out.println(String.format("Title: %s, Genre: %s, Rating: %d", one.title, one.genre, one.rating));
    }
}
