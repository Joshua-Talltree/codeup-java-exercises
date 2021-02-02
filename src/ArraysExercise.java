import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {

        // 1. Array Basics

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));



    // Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] team = new Person[3];
        team[0] = new Person("Joshua");
        team[1] = new Person("Joseli");
        team[2] = new Person("Jordin");
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getName());
        }
    }
}

