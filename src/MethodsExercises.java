import java.util.Scanner;

public class MethodsExercises {
    public static double Addition(int a,int b){
        return a + b;
    }
    public static double Subtraction(int a, int b){
        return a - b;
    }
    public static double Multiplication(int a, int b){
        return a * b;
    }
    public static double Division(int a, int b){
        return a / b;
    }
    public static int Modulus(int a, int b){
        return a % b;
    }
    public static int getInteger(int min, int max) {
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

    public static void main(String[] args) {
        System.out.println(Addition(4, 2));
        System.out.println(Subtraction(7, 3));
        System.out.println(Multiplication(6, 4));
        System.out.println(Division(8, 2));
        System.out.println(Modulus(5, 2));

        long theFactorial = getInteger(1,10);
        long helpfulInt = theFactorial;
        for(long i = 1; i < helpfulInt; i++){
            theFactorial = theFactorial * i;
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Would you like to continue [y/N] ");
        String userInput2 = sc2.next();
        boolean newConfirmation = userInput2.equals("y");
        if(newConfirmation){
            System.out.println("The Factorial of " + helpfulInt + " is " + theFactorial);
        }

    }
}

