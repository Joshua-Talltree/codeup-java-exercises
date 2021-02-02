import java.util.Random;

public class ServerNameGenerator {

    static String[] adj = {"good", "bad", "overbearing", "pretentious", "insidious", "lethargic", "defiant", "cruel", "dull", "fragile" };

    static String[] nouns = {"house", "cat", "girl", "Spain", "foot", "Sony", "mouse", "tooth", "table", "apple"};

    static Random rand1 = new Random();
    static Random rand2 = new Random();

    static int randAd = rand1.nextInt(10);
    static int randNoun = rand2.nextInt(10);

    public static void main(String[] args) {
        System.out.println("My server's new name is: " + adj[randAd] + " " + nouns[randNoun]);
    }

}