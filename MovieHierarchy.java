class Movie {
    protected String title;
    public Movie(String title) {
        this.title = title;
    }
    public void play() {
        System.out.println("Playing the movie: " + title);
    }
}
class RomComMovie extends Movie {
    public RomComMovie(String title) {
        super(title);
    }
    @Override
    public void play() {
        System.out.println("Enjoy a romantic and funny experience with: " + title);
    }
}
class ThrillerMovie extends Movie {
    public ThrillerMovie(String title) {
        super(title);
    }
    @Override
    public void play() {
        System.out.println("Get ready for suspense and thrill in: " + title);
    }
}
class ActionMovie extends Movie {
    public ActionMovie(String title) {
        super(title);
    }
    @Override
    public void play() {
        System.out.println("Experience adrenaline-pumping action in: " + title);
    }
}
public class MovieHierarchy  {
    public static void main(String[] args) {
        Movie movie1 = new RomComMovie("Honey Lemon Soda");
        Movie movie2 = new ThrillerMovie("Jujutsu Kaisen");
        Movie movie3 = new ActionMovie("Demon Slayer");
        movie1.play();
        movie2.play();
        movie3.play();
    }
}
