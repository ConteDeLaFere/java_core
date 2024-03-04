package hw_java_oop;

public class SlytherinStudent extends HogwartsStudent{
    private int trickery;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int greed;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int trickery, int determination, int ambition, int ingenuity, int greed) {
        super(name, magicPower, transgressionDistance);
        this.trickery = trickery;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.greed = greed;
    }

    @Override
    int calculateTraitPoints() {
        return trickery + determination + ambition + ingenuity + greed;
    }

    public void compareTraitPoints(SlytherinStudent student) {
        int traitPointsCompare = Integer.compare(calculateTraitPoints(), student.calculateTraitPoints());
        if (traitPointsCompare == -1) {
            System.out.printf("У %s меньше очков, чем у %s\n", name, student.name);
        } else if (traitPointsCompare == 0) {
            System.out.printf("У %s столько же очков, как и у %s\n", name, student.name);
        } else {
            System.out.printf("У %s больше очков, чем у %s\n", name, student.name);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTrickery: " + trickery +
                "\nDetermination: " + determination +
                "\nAmbition: " + ambition +
                "\nIngenuity: " + ingenuity +
                "\nGreed: " + greed;
    }
}
