package hw_java_oop;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent[] griffindor = new GriffindorStudent[] {
                new GriffindorStudent("Harry Potter", 80, 60, 5, 8, 9),
                new GriffindorStudent("Hermione Granger", 70, 60, 7, 7, 6),
                new GriffindorStudent("Ron Weasley", 50, 50, 5, 6, 6)
        };

        HufflepuffStudent[] hufflepuff = new HufflepuffStudent[] {
                new HufflepuffStudent("Zachariah Smith", 60, 50, 7, 5, 8),
                new HufflepuffStudent("Cedric Diggory", 50, 60, 8, 6, 7),
                new HufflepuffStudent("Justin Finch-Fletchley", 70, 50, 5, 6, 5)
        };

        RavenclawStudent[] ravenclaw = new RavenclawStudent[] {
                new RavenclawStudent("Zhou Chang", 70, 60, 8, 6, 6, 5),
                new RavenclawStudent("Padma Patil", 50 ,40, 6, 6, 5, 8),
                new RavenclawStudent("Marcus Belby", 60, 80, 7, 7, 8, 5)
        };

        SlytherinStudent[] slytherin = new SlytherinStudent[] {
                new SlytherinStudent("Draco Malfoy", 80, 50, 8, 5, 7, 5, 9),
                new SlytherinStudent("Graham Montague", 60, 50, 5, 6, 5, 7, 5),
                new SlytherinStudent("Gregory Goyle", 50, 60, 6, 6, 5, 8, 7)
        };

        System.out.println(griffindor[0]);
        System.out.println("---------------------------");
        System.out.println(slytherin[0]);
        System.out.println("---------------------------");

        griffindor[0].compareTraitPoints(griffindor[1]);
        ravenclaw[0].comparePower(griffindor[1]);
    }
}