public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Goodbye, World!");
        System.out.println("Hello, again, World!");

// TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 43;
        System.out.println(myFavoriteNumber);

// TODO: Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        String myString = "Let's play Java!";
        System.out.println(myString);

// TODO: Change your code to assign a character value to myString. What do you notice?

//        myString = 'D'; // says required String, provided char.

// TODO: Change your code to assign the value 3.14159 to myString. What happens?

//        myString = 3.14159; // says required String, provided double.

// TODO: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//        double myNumber; // says java: variable myNumber might not have been initialized
////         System.out.println(myNumber);

// TODO: Change your code to assign the value 3.14 to myNumber. What do you notice?

//         myNumber = 3.14; // required long, provided double
//         System.out.println(myNumber);

// TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        myNumber = 123L;

// TODO: Change your code to assign the value 123 to myNumber.

//        myNumber = 123;

// TODO: Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?



// TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

// TODO: Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);



// TODO: Try to create a variable named class. What happens?

        // int class = 34; // it says identifier expected.

// TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

//        System.out.println(theNumberThree);

// TODO: Copy and paste the code above and then run it. Does the result match with your expectation?
        // I, actually, didn't expect the error after I ran the code.
// TODO: How is the above example different from the code block below?
        // casting an integer to a string is not possible and vise versa
// TODO: What are the two different types of errors we are observing?
        // one happens after the run and the other happens pre-run.
// TODO: Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;

//        x += 5;
//        System.out.println(x);


//        int x = 3;
//        int y = 4;
////        y = y * x;
//
//        y *= x;
//
//        System.out.println(y);
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//        x /= y;
//        System.out.println(x);

//        y -= x;
//        System.out.println(y);


// TODO: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity? Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

        // it will loop back around to the lowest integer of the variable

        int bigNumber = Integer.MAX_VALUE;
        System.out.println(++bigNumber);

    }
}





