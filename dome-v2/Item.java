/**
 * The Item class represents a multi-media item.
 * Information about the item is stored and can be retrieved.
 * This class serves as a superclass for more specific itms.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Item {
    protected String title;
    protected int playingTime;
    protected boolean gotIt;
    protected String comment;

    /**
     * Initialise the fields of the item.
     *
     * @param theTitle The title of this item.
     * @param time     The running time of this item.
     */

    public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "";
    }

    public Item() {
    }

    /**
     * Enter a comment for this item.
     *
     * @param comment The comment to be entered.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return The comment for this item.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this item.
     *
     * @param ownIt true if we own the item, false otherwise.
     */
    public void setOwn(boolean ownIt) {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this item.
     */
    public boolean getOwn() {
        return gotIt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    /**
     * Print details about this item to the text terminal.
     */


    public void print() {
        System.out.print("title: " + title + " (" + playingTime + " mins)");
        if (gotIt) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + comment);
    }
}
