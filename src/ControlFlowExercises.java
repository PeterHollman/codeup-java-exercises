import java.util.Scanner;

public class ControlFlowExercises {
    static void fizzBuzz(int num)  {
        for (int i=1; i<= num; i++)  {
            if(i % 15 == 0) {
                System.out.println("fizzbuzzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0){
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
//        fizzBuzz(45);
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        int j;`
//      for (j=2; j <= 100; j +=2) {
//          System.out.println(i);
//      }
//      int k;
//         for (k = 2; k <= 1000000; k *=2) {
//             System.out.println(i);
//         }

        // Exercise 3

        Scanner theNumber = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        int numTable = theNumber.nextInt();
        int l;

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();
        boolean confirmation = userInput.equals("y");
        if(confirmation){
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            for(l = 1; l <= numTable; l++){
                System.out.println(l + "  |" + (l * l) + "  |" + (l * l * l));
            }
        }

        //Exercise 4

        Scanner theGradeScan = new Scanner(System.in);
        System.out.println("Please enter the Grade you got");
        int theGrade = theGradeScan.nextInt();


        Scanner sc2 = new Scanner(System.in);
        System.out.print("Would you like your grade [y/N] ");
        String userInput2 = sc2.next();
        boolean newConfirmation = userInput2.equals("y");
        if(newConfirmation){
            if(theGrade >= 90){
                System.out.println("You got an A!");
            } else if(theGrade >= 80){
                System.out.println("You got a B!");
            } else if(theGrade >= 70){
                System.out.println("You got a C!");
            } else if(theGrade >= 60){
                System.out.println("You got a D!");
            } else{
                System.out.println("You got a F!");
            }
        }

    }
}
