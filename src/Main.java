import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GreekGod g1 = new GreekGod("Zeus", "Lighting Bolt", "Sky", bigTwelve());
        GreekGod g2 = new GreekGod("Hades", "idk", "Underworld", bigTwelve());
        System.out.println(g1.isBigTwelve());
        System.out.println(g1.isSonOfCronus());
        System.out.println(g2.isBigTwelve());
        System.out.println(g2.isSonOfCronus());
        Boat b1 = new Boat(45, false, 150, 50);
        System.out.println(b1.isYacht());
        System.out.println(b1.topSpeed());
        Fish f1 = new Fish("salmon", 500, 34,15, 1.2, 500);
        System.out.println(f1.goodCatch());
        System.out.println(f1.projectedPop(3));
    }
    public static ArrayList bigTwelve() {
        ArrayList<String> major = new ArrayList<String>();
        major.add("Zeus");
        major.add("Hera");
        major.add("Poseidon");
        major.add("Demeter");
        major.add("Athena");
        major.add("Apollo");
        major.add("Artemis");
        major.add("Ares");
        major.add("Hephaestus");
        major.add("Aphrodite");
        major.add("Hermes");
        major.add("Dionysus");
        return major;

    }
}
