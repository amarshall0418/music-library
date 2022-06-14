public class Vocalist extends Musician{
    private String influenceBy;

    public Vocalist(String name, String country, String style, String timePeriod, String influenceBy) {
        super(name, country, style, timePeriod);
        this.influenceBy = influenceBy;
    }
}
