public class Guitarist extends Musician{
    private int numStrings;

    public Guitarist(String name, String country, String style, String timePeriod, int numStrings) {
        super(name, country, style, timePeriod);
        this.numStrings = numStrings;
    }
}
