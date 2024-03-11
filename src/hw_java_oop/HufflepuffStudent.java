package hw_java_oop;

public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(HufflepuffStudentBuilder builder) {
        super(builder.name, builder.magicPower, builder.transgressionDistance);
        this.diligence = builder.diligence;
        this.loyalty = builder.loyalty;
        this.honesty = builder.honesty;
    }

    public static class HufflepuffStudentBuilder {
        private String name;
        private int magicPower;
        private int transgressionDistance;
        private int diligence;
        private int loyalty;
        private int honesty;

        public HufflepuffStudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HufflepuffStudentBuilder setMagicPower(int magicPower) {
            this.magicPower = magicPower;
            return this;
        }

        public HufflepuffStudentBuilder setTransgressionDistance(int transgressionDistance) {
            this.transgressionDistance = transgressionDistance;
            return this;
        }

        public HufflepuffStudentBuilder setDiligence(int diligence) {
            this.diligence = diligence;
            return this;
        }

        public HufflepuffStudentBuilder setLoyalty(int loyalty) {
            this.loyalty = loyalty;
            return this;
        }

        public HufflepuffStudentBuilder setHonesty(int honesty) {
            this.honesty = honesty;
            return this;
        }

        public HufflepuffStudent build() {
            return new HufflepuffStudent(this);
        }
    }

    private int calculateTraitPoints() {
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
