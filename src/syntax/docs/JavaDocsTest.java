package syntax.docs;

import java.util.Scanner;


public class JavaDocsTest {
    public static void main(String[] args) {
        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}
