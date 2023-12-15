import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Film movie1 = new Film("Godfather", "USA", 1972);

        Movies movies = new Movies();
        movies.addData(movie1);
        movies.addData(new Film("Shawshank redemption", "USA", 1994));
        movies.addData(new Film("Pulp Fiction", "USA", 1994));
        movies.addData(new Film("Forrest Gump", "USA", 1994));
        movies.addData(new Film("Silence of the lambs", "USA", 1991));

        System.out.println("-------------slots are full-------------");
        movies.addData(new Film("Matrix", "USA", 1999));
        System.out.println(movies);

        int[] tutorialArray = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(tutorialArray));

        tutorialArray = Arrays.copyOfRange(tutorialArray, 1, 10);
        System.out.println(Arrays.toString(tutorialArray));


//      Film[] copiedArray = movies.toArray();
        movies.removeByName("Godfather");
        System.out.println(Arrays.toString(movies.toArray()));
        movies.removeByName("Silence of the lambs");
        System.out.println(Arrays.toString(movies.toArray()));

        Film[] filmArray = movies.toArray();
        filmArray[1] = movie1;
        System.out.println(Arrays.toString(filmArray));


    }
}