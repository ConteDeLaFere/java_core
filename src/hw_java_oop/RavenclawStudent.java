package hw_java_oop;

public class RavenclawStudent extends HogwartsStudent{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;
    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    int calculateTraitPoints() {
        return intelligence + wisdom + wit + creativity;
    }

    public void compareTraitPoints(RavenclawStudent student) {
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
                "\nIntellegence: " + intelligence +
                "\nWisdom: " + wisdom +
                "\nWit: " + wit +
                "\nCreativity: " + creativity;
    }
}
