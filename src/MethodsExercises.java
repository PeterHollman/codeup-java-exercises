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
        System.out.print("Enter a number between " + min + " and " + max);
        do {
            int userInput = scanner.nextInt();
            if (userInput < min){
                System.out.println("That's too low ");
            } else if(userInput > max){
                System.out.println("That's too high");
            } else {
                System.out.println(userInput);
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
        getInteger(1, 10);
    }
}
