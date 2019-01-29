package mk.p.adapter;

/**
 * Round Hole is compatible with Round Pegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean results;
        results = (this.getRadius() >= peg.getRadius());
        return results;
    }
}