package com.javatutorial.oop.part1;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent[] griffindor = {
                new GriffindorStudent.GriffindorStudentBuilder()
                        .setName("Harry Potter")
                        .setMagicPower(80)
                        .setTransgressionDistance(70)
                        .setNobility(7)
                        .setHonor(8)
                        .setBravery(8)
                        .build(),

                new GriffindorStudent.GriffindorStudentBuilder()
                        .setName("Hermione Granger")
                        .setMagicPower(70)
                        .setTransgressionDistance(70)
                        .setNobility(6)
                        .setHonor(7)
                        .setBravery(7)
                        .build(),

                new GriffindorStudent.GriffindorStudentBuilder()
                        .setName("Ron Weasley")
                        .setMagicPower(60)
                        .setTransgressionDistance(50)
                        .setNobility(5)
                        .setHonor(6)
                        .setBravery(6)
                        .build()
        };

        HufflepuffStudent[] hufflepuff = {
                new HufflepuffStudent.HufflepuffStudentBuilder()
                        .setName("Zachariah Smith")
                        .setMagicPower(60)
                        .setTransgressionDistance(50)
                        .setDiligence(7)
                        .setHonesty(6)
                        .setLoyalty(7)
                        .build(),

                new HufflepuffStudent.HufflepuffStudentBuilder()
                        .setName("Cedric Diggory")
                        .setMagicPower(70)
                        .setTransgressionDistance(60)
                        .setDiligence(7)
                        .setHonesty(8)
                        .setLoyalty(5)
                        .build(),

                new HufflepuffStudent.HufflepuffStudentBuilder()
                        .setName("Justin Finch-Fletchley")
                        .setMagicPower(50)
                        .setTransgressionDistance(60)
                        .setDiligence(6)
                        .setHonesty(6)
                        .setLoyalty(7)
                        .build()
        };

        RavenclawStudent[] ravenclaw = {
                new RavenclawStudent.RavenclawStudentBuilder()
                        .setName("Zhou Chang")
                        .setMagicPower(60)
                        .setTransgressionDistance(60)
                        .setCreativity(7)
                        .setWit(7)
                        .setIntelligence(8)
                        .setWisdom(7)
                        .build(),

                new RavenclawStudent.RavenclawStudentBuilder()
                        .setName("Padma Patil")
                        .setMagicPower(60)
                        .setTransgressionDistance(50)
                        .setCreativity(6)
                        .setWit(8)
                        .setIntelligence(6)
                        .setWisdom(6)
                        .build(),

                new RavenclawStudent.RavenclawStudentBuilder()
                        .setName("Marcus Belby")
                        .setMagicPower(70)
                        .setTransgressionDistance(70)
                        .setCreativity(8)
                        .setWit(5)
                        .setIntelligence(8)
                        .setWisdom(6)
                        .build()
        };

        SlytherinStudent[] slytherin = {
                new SlytherinStudent.SlytherinStudentBuilder()
                        .setName("Draco Malfoy")
                        .setMagicPower(80)
                        .setTransgressionDistance(70)
                        .setAmbition(8)
                        .setGreed(8)
                        .setDetermination(6)
                        .setIngenuity(7)
                        .setTrickery(7)
                        .build(),

                new SlytherinStudent.SlytherinStudentBuilder()
                        .setName("Graham Montague")
                        .setMagicPower(60)
                        .setTransgressionDistance(50)
                        .setAmbition(6)
                        .setGreed(6)
                        .setDetermination(5)
                        .setIngenuity(5)
                        .setTrickery(7)
                        .build(),

                new SlytherinStudent.SlytherinStudentBuilder()
                        .setName("Gregory Goyle")
                        .setMagicPower(70)
                        .setTransgressionDistance(50)
                        .setAmbition(7)
                        .setGreed(6)
                        .setDetermination(6)
                        .setIngenuity(6)
                        .setTrickery(6)
                        .build(),
        };

        System.out.println(griffindor[0]);
        System.out.println("---------------------------");
        System.out.println(slytherin[0]);
        System.out.println("---------------------------");

        griffindor[0].compareTraitPoints(griffindor[1]);
        ravenclaw[0].comparePower(griffindor[1]);
    }
}