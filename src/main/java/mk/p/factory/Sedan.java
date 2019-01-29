package mk.p.factory;

public class Sedan implements CarBuild {
    @Override
    public void build() {
        System.out.println("You chose a Sedan");
    }
}