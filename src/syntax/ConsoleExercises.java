package syntax;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

// TODO: Copy this code into your main method:

        double pi = 3.14159;

// TODO: Write some Java code that uses the variable pi to output the following: The value of pi is approximately 3.14.

        PrintStream format;
        System.out.printf("The value of pi is approximately: %.2f\n", pi);

// TODO: Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        System.out.format("The value of pi is now: %.3f\n", pi);

// TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int number = scanner.nextInt();

        System.out.println("You entered: --> \"" + number + "\" <--");


// TODO: What happens if you input something that is not an integer?

        // it throws an InputMismatchException because of the fact that it was not a integer that was entered in.
//
// TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline. What happens if you enter less than 3 words? What happens if you enter more than 3 words?

        System.out.print("Please enter 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("You entered this word: \"" + word1 + "\"");
        System.out.println("this word: \"" + word2 + "\"");
        System.out.println("and this word: \"" + word3 + "\"");


//
// TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. do you capture all the words?

        System.out.print("Please enter a sentence here: ");
//        String oneSentence = scanner.next(); // only grabs the fisrt token and then sees the white space and stops
        String oneSentence = scanner.nextLine();

        System.out.println("Your sentence: \"" + oneSentence + "\"");

// TODO: Rewrite the above example using the nextLine method.

// Calculate the perimeter and area of Codeup's classrooms.

// TODO: Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and parse the resulting string to a numeric type. Assume that the rooms are perfect rectangles. Assume that the user will enter valid numeric data for length and width.

//        System.out.print("Enter the length and width of the room here: ");
//        String length = scanner.next();
//        String width = scanner.next();
//        String equals = scanner.next();



//        System.out.println("The result of the length is: " + length);
//        System.out.println("The result of the width is: " + width);
//
// TODO: Display the area and perimeter of that classroom. The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        System.out.print("Enter the length, the width, and area measurement here:");
        System.out.print("Enter the length and width, multiplied by 2 here:");
//        String lengthWidthEquals = scanner.nextLine();
        String lengthTwoWidthTwoEquals = scanner.nextLine();

//        System.out.println("The area of the room is: " + lengthWidthEquals);
        System.out.println("The perimeter of a room is: " + lengthTwoWidthTwoEquals);


    }
}
