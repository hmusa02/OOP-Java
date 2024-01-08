package week5.storage;

public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private static final double WEIGHT = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}
