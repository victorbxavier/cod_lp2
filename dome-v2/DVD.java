/**
 * The DVD class represents a DVD object. Information about the
 * DVD is stored and can be retrieved. We assume that we only deal
 * with movie DVDs at this stage.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class DVD extends Item {
    private String director;

    /**
     * Constructor for objects of class DVD
     *
     * @param theTitle    The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time        The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time) {
        super(theTitle, time);
        director = theDirector;
    }

    public DVD() {
    }

    /**
     * @return The director for this DVD.
     */
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void print() {
        System.out.println("title: " + getTitle() + " (" + getPlayingTime() + " mins)");
        System.out.println("Director" + getDirector());
        if (super.getOwn()) {
            System.out.println("***");
        } else {
            System.out.println();
        }
        System.out.println("Comment: " + getComment());
    }
}
