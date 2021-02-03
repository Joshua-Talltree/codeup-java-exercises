import java.util.Random;

public class ServerNameGenerator {

    static String[] adj = {"good", "bad", "overbearing", "pretentious", "insidious", "lethargic", "defiant", "cruel", "whinny", "fragile" };

    static String[] nouns = {"man", "cat", "girl", "boy", "foot", "baby", "mouse", "tooth", "table", "apple"};

    static Random rand1 = new Random();
    static Random rand2 = new Random();

    static int randAd = rand1.nextInt(10);
    static int randNoun = rand2.nextInt(10);

    public static void main(String[] args) {
        System.out.println("Your server's name is: " + adj[randAd] + "-" + nouns[randNoun]);
    }

}