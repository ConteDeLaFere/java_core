package hw_java_oop;

public class HufflepuffStudent extends HogwartsStudent{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    int calculateTraitPoints() {
        return diligence + honesty + loyalty;
    }

    public void compareTraitPoints(HufflepuffStudent student) {
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
                "\nDiligence: " + diligence +
                "\nLoyalty: " + loyalty +
                "\nHonesty: " + honesty;
    }
}
