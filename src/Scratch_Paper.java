import java.util.Scanner;

public class Scratch_Paper {

    // public static returnType method
    public static int addNumbers(int num1, int num2) {
        return num1 + num2; // because the type is "int" - this method must return and "int"
    }

    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static void greetings() {
        // void methods can be static or non-static - main point is that they will NOT have to return anything
        System.out.println("Hello to you!");
        // this not returning anything
    }

    public static void main(String[] args) {
        int sum = Scratch_Paper.addNumbers(2, 2);
        System.out.println("Using our static method");
        System.out.println(sum);


        double squaredNumber = Math.pow(3, 2);

        // Non-static
        Scratch_Paper mathWiz = new Scratch_Paper();
        mathWiz.greetings();
        int difference = mathWiz.subtractNumbers(10, 6); // num1 - num2
        System.out.println("Using the non-static method: ");
        System.out.println(difference);

        System.out.println(Scratch_Paper.tenureMessage("Casey", "PHP", 11));
        System.out.println(Scratch_Paper.tenureMessage("Daniel", "Java", 15));
        System.out.println(Scratch_Paper.tenureMessage("Fernando", "PHP", 30));

        System.out.println(Scratch_Paper.tenureMessage("Casey", "Java"));
        System.out.println(Scratch_Paper.tenureMessage("Go"));
        Scratch_Paper.sayHello(8);
        System.out.println(Scratch_Paper.shout("Hello"));
        Scratch_Paper.count(5);
        System.out.println(Scratch_Paper.getPower(6, 3));
        System.out.println(Scratch_Paper.getPowerRecursive(6, 3));
    } // End of psvm

    // start of tenureMessage
    public static String tenureMessage(String name, String progLang, int numYears) {
        // String thePersonName = name;
        // String codingLanguage = progLang;
        // int totalTime = numYears;

        return name + " has been coding " + progLang + " for " + numYears + " years ";
    //        return "X has done Y for Z years";
    }
    // ************************* METHOD OVERLOADING ********************** //
    public static String tenureMessage(String name, String progLang) {
        return name + " is super good at " + progLang;
    }

    public static String tenureMessage(String progLang) {
        return "Somebody is super good at " + progLang;
    }

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    //*********************** RECURSION *******************************//

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1); // 2. count(5-1), i.e. count(4)
                        // 3. count(4-1), i.e. count (3)
                        // 4. count(3-1), i.e. count (2)
                        // 5. count(2-1), i.e. count (1)
                        // 6. count(1-1), i.e. count (0)
    }

    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) { // 1. getPower(6, 3)
            result = result * base; // 1. res = 1 * 6;
                                    // 2. res = 6 * 6;   (36)
                                    // 3. res = 36 * 6;  (216)
        }
        return result;
    }
    // Doing exponent
    public static long getPowerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPowerRecursive(base, exponent - 1); // we want to do 3 ^ 5, i.e. getPowerRecursive(3, 5)

        // 1. return 3 * getPowerRecursive(3, (5-1)), i.e. getPowerRecursive(3, 4)
        // 2. return 3 * ( 3 * getPowerRecursive(3, (4-1)), i.e. getPowerRecursive(3, 3)
        // 3. return 3 * ( 3 * ( 3 * ( getPowerRecursive(3, (3-1)) ), i.e. getPowerRecursive(3, 2)
            // 3.a) return 3 * ( 3 * ( 3 ) ) ) * 3 * 3;
                /// = 3 * 3 * 3 * 3 * 3
                /// = 3 ^ 5 = 243
    }



}
//        Scanner sc = new Scanner(System.in);
//
//        String firstName = "Josh";
//        int age = 41;
////
//        System.out.print("What's your name? ");
//        firstName = sc.nextLine();
//
//        //!firstName.equals("Josh") not equals
//        if(firstName.equalsIgnoreCase("Fer")){
//            System.out.println("firstName is Josh");
//        } else {
//            System.out.println("firstName is not Josh");
//        }
//        // Integer grabs more functions (wrapper class)
//        System.out.println("Your name is: " + firstName);
//        System.out.println("Your age is: " + age);
//
//
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//        System.out.println("What's your email?");
//        String email = sc.next();
//
//        System.out.println("index of @ is: " + email.indexOf("@"));
//        System.out.println("char at " + email.charAt(3));
//        System.out.println("Last index of m: " + email.lastIndexOf(m));
//
//        for(int x = 0; x < email.length(); x++) {
//            System.out.println("email.charAt(x) = " + email.charAt(x));
//        }

//        if(email.equalsIgnoreCase("joshua.scott.talltree@gmail.com")){
//            System.out.println("You are an admin");
//        }

//        if(email.toLowerCase().endsWith("gmail.com")) {
//            System.out.println("Welcome co-worker");
//        }
// do not use == to compare strings
//        String name = "Joshua";
//        int x = 5 * 4 % 3;
//        System.out.println(x);
//        System.out.println(name + "" + x);
