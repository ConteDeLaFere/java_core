package com.javatutorial.oop.part1;

public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(GriffindorStudentBuilder builder) {
        super(builder.name, builder.magicPower, builder.transgressionDistance);
        this.nobility = builder.nobility;
        this.honor = builder.honor;
        this.bravery = builder.bravery;
    }

    public static class GriffindorStudentBuilder {
        private String name;
        private int magicPower;
        private int transgressionDistance;
        private int nobility;
        private int honor;
        private int bravery;

        public GriffindorStudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GriffindorStudentBuilder setMagicPower(int magicPower) {
            this.magicPower = magicPower;
            return this;
        }

        public GriffindorStudentBuilder setTransgressionDistance(int transgressionDistance) {
            this.transgressionDistance = transgressionDistance;
            return this;
        }

        public GriffindorStudentBuilder setNobility(int nobility) {
            this.nobility = nobility;
            return this;
        }

        public GriffindorStudentBuilder setHonor(int honor) {
            this.honor = honor;
            return this;
        }

        public GriffindorStudentBuilder setBravery(int bravery) {
            this.bravery = bravery;
            return this;
        }

        public GriffindorStudent build() {
            return new GriffindorStudent(this);
        }
    }

    private int calculateTraitPoints() {
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
