package mk.p.factory;

public class Van implements CarBuild {
    @Override
    public void build() {
        System.out.println("You chose a Van");
    }
}