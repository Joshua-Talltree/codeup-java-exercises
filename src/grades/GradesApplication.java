package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {

        Student newStudent1 = new Student("Alex");
        newStudent1.addGrade(79);
        newStudent1.addGrade(86);
        newStudent1.addGrade(94);
        newStudent1.addGrade(71);
        System.out.println(newStudent1.getGradesAverage());

        Student newStudent2 = new Student("Paul");
        newStudent2.addGrade(65);
        newStudent2.addGrade(99);
        newStudent2.addGrade(78);
        newStudent2.addGrade(84);
        System.out.println(newStudent2.getGradesAverage());

        Student newStudent3 = new Student("Jimmy");
        newStudent3.addGrade(89);
        newStudent3.addGrade(59);
        newStudent3.addGrade(90);
        newStudent3.addGrade(63);
        System.out.println(newStudent3.getGradesAverage());

        Student newStudent4 = new Student("Derek");
        newStudent4.addGrade(72);
        newStudent4.addGrade(81);
        newStudent4.addGrade(64);
        newStudent4.addGrade(100);
        System.out.println(newStudent4.getGradesAverage());

        HashMap<String, Student> usernames = new HashMap<>();
        usernames.put("alexthegreat", newStudent1);
        usernames.put("paulgisking", newStudent2);
        usernames.put("jimmytwotimes", newStudent3);
        usernames.put("derekiscool", newStudent4);



        do{
        System.out.println(usernames.keySet());
        Scanner studentScanner = new Scanner(System.in);
        System.out.println("Enter the username of your choice: ");
        String studentGrades = studentScanner.nextLine().trim();


        if (usernames.get(studentGrades) == null) {
            System.out.println("Sorry, that name does not exist, try again..");
        } else {
            System.out.println("Here's is the user's name: " + usernames.get(studentGrades).getNames());
            System.out.println("Here are the user's grades: " + usernames.get(studentGrades).getGrades());
            System.out.println("Here are the user's grade averages: " + usernames.get(studentGrades).getGradesAverage());
        }
            System.out.println("Would you like to see another student? ");
            String userInput = studentScanner.nextLine().trim();
            if (userInput.equalsIgnoreCase("No")){
                break;
            }
        } while(true);
        System.out.println("Thank you for coming, goodbye!");
    }
}
