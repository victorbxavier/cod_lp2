/**
 * The CD class represents a CD object. Information about the
 * CD is stored and can be retrieved.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class CD extends Item {
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     *
     * @param theTitle  The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks    The number of tracks on the CD.
     * @param time      The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time) {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    public CD() {
    }

    /**
     * @return The artist for this CD.
     */
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public void print() {
        System.out.println("title: " + getTitle() + " (" + getPlayingTime() + " mins)");
        System.out.println("Artist: " + getArtist() + " - Number of tracks: " + getNumberOfTracks());
        if (super.getOwn()) {
            System.out.println("***");
        } else {
            System.out.println();
        }
        System.out.println("Comment: " + getComment());
    }
}
