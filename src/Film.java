public class Film {

    private String title;
    private String country;
    public int year;

    public Film(String title, String country, int year) {
        this.title = title;
        this.country = country;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Movie: \""+ title + "\" (" + year + ") " + country;
    }
}
