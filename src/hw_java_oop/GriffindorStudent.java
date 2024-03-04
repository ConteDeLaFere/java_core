package hw_java_oop;

public class GriffindorStudent extends HogwartsStudent{
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    int calculateTraitPoints() {
        return nobility + honor + bravery;
    }

    public void compareTraitPoints(GriffindorStudent student) {
        int traitPointsCompare = Integer.compare(calculateTraitPoints(), student.calculateTraitPoints());
        if (traitPointsCompare == -1) {
            System.out.printf("%s has less points than %s\n", name, student.name);
        } else if (traitPointsCompare == 0) {
            System.out.printf("%s has the same amount of points as %s does\n", name, student.name);
        } else {
            System.out.printf("%s has more points than %s\n", name, student.name);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNobility: " + nobility +
                "\nHonor: " + honor +
                "\nBravery: " + bravery;
    }
}
