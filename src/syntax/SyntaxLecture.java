package syntax;

public class SyntaxLecture {

    // psvm is the shortcut for the Public Static Void Main.
    public static void main(String[] args) {

        // ================== STATEMENTS (s-3)

        // everything is run in the PSVM.

        // Statements may be...
        // Declarations
        int number = 7; // = is just assignment in Java


        // int number; = a variable.

        // keyboard shortcut for formatting is CMD option l

        // Assignment expressions

        // Any use of ++ or --
        // pre-increment
        --number; // this will be decremented BEFORE it's evaluated
        System.out.println("The numbers value after pre-decrementing is: " + number);
        number++; // this will be incrementing AFTER it's evaluated on this line
        System.out.println("The numbers value after pre-incrementing is: " + number);

        System.out.println("Pre-decrementing " + number + " = " + --number);
        System.out.println("Post-decrementing " + number + " = " + number++);

        System.out.println("Now, the number " + " = " + number);


        // Method invocations

        Math.random(); // call the random(); method from the math class

        double randomNumber = Math.random();

        // Object creation expressions


        // CMD click on function to see the documentation.

        // ================== COMMENTS (s-4)

        // see JavaDocTest in docs package

        // ================== DATA TYPES (s-5, 6, 7)

        // use the smallest type needed for the job

        // primitive types...

        byte age = 125;
        System.out.println("Adding one to the byte(125) : " + ++age);
        System.out.println("Adding one to the byte(126) : " + ++age);
        System.out.println("Adding one to the byte(126) : " + ++age);


        // System.out.println(age);
        // age = 200; can't run
        // System.out.println(age);

        short minimumAnnualSalary = 32765;
        System.out.println("Adding one to the salary(32765) : " + ++minimumAnnualSalary);
        System.out.println("Adding one to the salary(32766) : " + ++minimumAnnualSalary);
        System.out.println("Adding one to the salary(32767) : " + ++minimumAnnualSalary);

        int distanceToSaturn = 1200000000;
        long numberOfHumanCells = 3000000000L; // L needed for compiler

        // access something at the end of a database, using longs
        // books[1L]


        System.out.println(numberOfHumanCells);
        float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
        System.out.println(lengthOfBacteriaInInches);
        double widthOfAtomInMeters = .00000000001;

        char seatingSection = 'M'; // must wrap in single quotes

//        boolean everythingIsAwesome = false;
//        !everythingIsAwesome = true;
//
//        if (false) {
//            System.out.println("Everything is awesome!");
//        }
//        if (!everythingIsAwesome) {
//            System.out.println("Everything is NOT awesome");
//        }
//        // strings (not a primitive type)
//
//        // reference type data refers to a location in memory, holding the contents of that variable
//        String thisIsAString = "Hello";
//        String anotherString = "Hello";
//
//        if (thisIsAString == anotherString) {
//            System.out.println("The two are equal, from double equals.");
//        }
//        // correct way to check for equivalent
//        if (thisIsAString.equals(anotherString)) {
//            System.out.println("We used .equals, and they  are equivalent");
//        }

        // Java: .equals not ==
        // like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
        System.out.println("Hello\nWorld");
        System.out.println("Hello");
        System.out.println("World");

        //want to sout something like Hello, "groovy" world
        System.out.println("Hello, \"groovy\" World");

        char someLetter = 'Y';
        System.out.println(someLetter);
        // if you sout, and the console shows a result of ~ @4325345

        // Let's create a string and then system ouot the first character in that string
        String myName = "Joshua";
        System.out.println(myName.charAt(0));
        System.out.println(myName.offsetByCodePoints(0, 2));
        // primitive data types are "what you see is what you get" and a reference data type is capitalized.

        // Java uses method because it's a function that you call that's attached to an object


        // ================== VARIABLES (s-8)

        // declaration separate from initialization

        // int number; // we have initialized
        int faveNumber; // declared the variable
        faveNumber = 42;

        // declaration and initialization
        // id myFaveNumber = 42;

        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // Do not use reserved words

        // ================== CONSTANTS (s-10)

        final double CIV_MAX_DOLLARS = 2147483647;
        // CIV_MAX_DOLLARS = 3; // cannot reassign/modify final variables

        // ================== EXPRESSIONS (s-11)

        // basically the same as JS
        int firstValue = 97;
        int secondValue = 99;

        int sumOfValues = firstValue + secondValue;
        int deltaValue = firstValue - secondValue;
        int product = firstValue * secondValue;
        int quotient = firstValue / secondValue;

        // ================== OPERATORS (s-12)

        // basically the same as JS
        int reverseNumber = -72;
        int oppositeDay = -reverseNumber;
        int bePositive = +reverseNumber;

        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS

        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/

        // IMPLICIT: implied but not plainly expressed.
        short x = 8;
        int y = x;

        // EXPLICIT: stated clearly and in detail.
        int civDollars = 20999999;
        byte civSandwich = (byte) civDollars;
        System.out.println("Making a nice civ sandwich: " + civSandwich);

        // implicit casting - less to more precise (widening)

        float num1 = 2.22F;
        double num2 = num1;
        System.out.println(num1);

        // explicit casting - more to less explicit casting (narrowing)

        double num3 = 3.1;
        float num4 = (float) num3;
        //
        System.out.println(num4);

    }

}

