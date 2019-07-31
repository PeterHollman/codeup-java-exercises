package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public static String getString(){
        System.out.println("Enter something");
        Scanner scanner = new Scanner(System.in);
        String theString = scanner.nextLine();
        System.out.println(theString);
        return theString;
    }

    public static boolean yesNo(){
        System.out.println("Do you agree? y/n");
        Scanner scanner = new Scanner(System.in);
        String theString = scanner.next();
        boolean confirmation = theString.contains("y");
        System.out.println(confirmation);
        return confirmation;
    }
    public static int getInt(){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int theInt = scanner.nextInt();
        System.out.println("You entered " + theInt);
        return theInt;
    }
    public static double getDouble() {
        System.out.println("Enter a fraction");
        Scanner scanner = new Scanner(System.in);
        double theDouble = scanner.nextDouble();
        System.out.println("You entered " + theDouble);
        return theDouble;
    }

    public static int getInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        do {
            int userInput = scanner.nextInt();
            if (userInput < min){
                System.out.println("That's too low ");
                System.out.println("Enter a number between " + min + " and " + max);

            } else if(userInput > max){
                System.out.println("That's too high");
                System.out.println("Enter a number between " + min + " and " + max);

            } else {
                return userInput;
            }
        } while(true);
    }


    public static double getDouble(double min, double max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        do {
            double userInput = scanner.nextDouble();
            if (userInput < min){
                System.out.println("That's too low ");
                System.out.println("Enter a number between " + min + " and " + max);

            } else if(userInput > max){
                System.out.println("That's too high");
                System.out.println("Enter a number between " + min + " and " + max);

            } else {
                return userInput;
            }
        } while(true);
    }

public static void main(String[] args) {
    getString();
    yesNo();
    getInt();
    getDouble(0.5, 2.5);
    getDouble();
    getInt(1,10);
}

}
