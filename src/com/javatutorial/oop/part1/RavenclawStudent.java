package com.javatutorial.oop.part1;

public class RavenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(RavenclawStudentBuilder builder) {
        super(builder.name, builder.magicPower, builder.transgressionDistance);
        this.intelligence = builder.intelligence;
        this.wisdom = builder.wisdom;
        this.wit = builder.wit;
        this.creativity = builder.creativity;
    }

    public static class RavenclawStudentBuilder {
        private String name;
        private int magicPower;
        private int transgressionDistance;
        private int intelligence;
        private int wisdom;
        private int wit;
        private int creativity;

        public RavenclawStudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RavenclawStudentBuilder setMagicPower(int magicPower) {
            this.magicPower = magicPower;
            return this;
        }

        public RavenclawStudentBuilder setTransgressionDistance(int transgressionDistance) {
            this.transgressionDistance = transgressionDistance;
            return this;
        }

        public RavenclawStudentBuilder setIntelligence(int intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        public RavenclawStudentBuilder setWisdom(int wisdom) {
            this.wisdom = wisdom;
            return this;
        }

        public RavenclawStudentBuilder setWit(int wit) {
            this.wit = wit;
            return this;
        }

        public RavenclawStudentBuilder setCreativity(int creativity) {
            this.creativity = creativity;
            return this;
        }

        public RavenclawStudent build() {
            return new RavenclawStudent(this);
        }
    }

    private int calculateTraitPoints() {
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
