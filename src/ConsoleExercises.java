import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The Value of Pi is approximately %.2f \n", pi);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int myInt = scan.nextInt();
        System.out.println("The Number you entered is " + myInt);

        Scanner threeWords = new Scanner(System.in);
        System.out.println("Enter three words");
        String firstWord = threeWords.next();
        String secondWord = threeWords.next();
        String thirdWord = threeWords.next();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        Scanner theSentence = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String foxJumps = theSentence.nextLine();
        System.out.println(foxJumps);
        Scanner theLength = new Scanner(System.in);
        System.out.println("Enter the width of the classroom");
        int lengthCalc = theLength.nextInt();
        Scanner theWidth = new Scanner(System.in);
        System.out.println("Enter the length of the classroom");
        int widthCalc = theWidth.nextInt();
        int theArea = lengthCalc * widthCalc;
        System.out.println("The area of the classroom is " + theArea);
    }
}
