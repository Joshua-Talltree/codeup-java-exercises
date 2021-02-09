import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.*;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        // Mini Exercise
        //
        // 1. Create a class named FileIOLesson
        // 2. Do your work inside of a main method
        // 3. Write Java code to create a file named languages.txt. Specify languages.txt as a relative path (Paths.get("languages.txt")).
//        Path Files.createFile(Path, "languages.txt");

        // creating a .txt file
        Path filepath = Paths.get("languages.txt");
        // you won't see exception with "if" statement
        if (! Files.exists(filepath)) {
            Files.createFile(filepath);
        }
        //    Where is this file created after you run your code?
        // 4. Run your code that creates the languages.txt file again. What happens when you try to create a file that already exists?
        // 5. Update your code to check for the presence of languages.txt before creating it.

        // 1. Create a variable named languages that is a list of strings. Each string should be one programming language that you know.

        List<String> languages = Arrays.asList(
                "JavaScript",
                "Java",
                "CSS",
                "HTML"
        );
        Files.write(filepath, languages, StandardOpenOption.APPEND);

//        for (int i = 0; i < languages.size(); i += 1) {
//            System.out.println((i + 1) + ": " + languages.get(i));

            List<String> lines = Files.readAllLines(filepath);

            for(String line : lines) {
                System.out.println("Here is a language I  like: " + line);
                if (line.equals("JavaScript")) {
                    System.out.println("This is my favorite language!: ");
                }

//            }
        }
        // 1. Write the code to add the programming languages you know, each on a seperate line, to languages.txt.
        // 1. Run your code and open the languages.txt file. What do you notice?
        // 1. Re-run your code that adds the languages. Open the languages.txt file again. What do you notice?
        // 1. Modify your languages variable and remove one of the languages. Re-run your code and inspect the languages.txt file. What do you notice?
    }
}
