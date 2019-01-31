package mk.p.adapter;

/**
 * The adapter allows you to use Square Taps and Round Holes together.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        // We calculate the minimum radius into which this peg will crawl.
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}