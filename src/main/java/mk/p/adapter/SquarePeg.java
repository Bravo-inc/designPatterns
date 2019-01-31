package mk.p.adapter;

/**
 * Square Pegs are incompatible with Round Holes
 * (they remained in the project after former developers).
 * But we must somehow integrate them into our system.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}