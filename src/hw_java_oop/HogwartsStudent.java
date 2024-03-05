package hw_java_oop;

public abstract class HogwartsStudent {
    protected final String name;
    protected final int magicPower;
    protected final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void comparePower(HogwartsStudent student) {
        int powerCompare = Integer.compare(calculatePower(), student.calculatePower());
        if (powerCompare == -1) {
            System.out.printf("%s has more magic power than %s\n", name, student.name);
        } else if (powerCompare == 0) {
            System.out.printf("%s has the same magic power as %s\n", name, student.name);
        } else {
            System.out.printf("%s has less magic power than %s\n", name, student.name);
        }
    }

    private int calculatePower() {
        return magicPower + transgressionDistance;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nMagic power: " + magicPower +
                "\nTransgression distance: " + transgressionDistance;
    }
}
