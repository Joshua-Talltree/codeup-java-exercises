package util;

import java.util.Scanner;

public class Input() {

    private Scanner scanner;


    public Input() {
        this.scanner = new Scanner(System.in);
    }

    String getString() {
        return this.scanner.nextLine();
    }

    boolean yesNo(){
        return this.scanner.nextBoolean();
        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("Y") ||
                answer.toLowerCase().equals("yes"));
    }

    int getInt(){
        return this.scanner.nextInt();
    }

    int getInt(int min int max) {
        while (true) {
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

    double getDouble(){
        return this.scanner.nextDouble();
    }

    double getDouble(double min double max) {
        while (true) {
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

}
