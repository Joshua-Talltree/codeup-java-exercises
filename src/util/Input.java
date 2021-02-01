package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;


    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        return this.scanner.nextBoolean();
        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("Y") ||
                answer.toLowerCase().equals("yes"));
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public int getInt(int min int max) {
        while (true) {
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

    public double getDouble(double min double max) {
        while (true) {
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

}
