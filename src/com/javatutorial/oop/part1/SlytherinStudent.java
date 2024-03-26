package com.javatutorial.oop.part1;

public class SlytherinStudent extends HogwartsStudent {
    private int trickery;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int greed;

    public SlytherinStudent(SlytherinStudentBuilder builder) {
        super(builder.name, builder.magicPower, builder.transgressionDistance);
        this.trickery = builder.trickery;
        this.determination = builder.determination;
        this.ambition = builder.ambition;
        this.ingenuity = builder.ingenuity;
        this.greed = builder.greed;
    }

    public static class SlytherinStudentBuilder {
        private String name;
        private int magicPower;
        private int transgressionDistance;
        private int trickery;
        private int determination;
        private int ambition;
        private int ingenuity;
        private int greed;

        public SlytherinStudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SlytherinStudentBuilder setMagicPower(int magicPower) {
            this.magicPower = magicPower;
            return this;
        }

        public SlytherinStudentBuilder setTransgressionDistance(int transgressionDistance) {
            this.transgressionDistance = transgressionDistance;
            return this;
        }

        public SlytherinStudentBuilder setTrickery(int trickery) {
            this.trickery = trickery;
            return this;
        }

        public SlytherinStudentBuilder setDetermination(int determination) {
            this.determination = determination;
            return this;
        }

        public SlytherinStudentBuilder setAmbition(int ambition) {
            this.ambition = ambition;
            return this;
        }

        public SlytherinStudentBuilder setIngenuity(int ingenuity) {
            this.ingenuity = ingenuity;
            return this;
        }

        public SlytherinStudentBuilder setGreed(int greed) {
            this.greed = greed;
            return this;
        }

        public SlytherinStudent build() {
            return new SlytherinStudent(this);
        }
    }

    private int calculateTraitPoints() {
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
