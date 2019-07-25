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
        int i;
//      for (i=2; i <= 100; i +=2) {
//          System.out.println(i);
//      }
//         for (i = 2; i <= 1000000; i *=2) {
//             System.out.println(i);
//         }

        // Exercise 3

        Scanner theNumber = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        int numTable = theNumber.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();
        boolean confirmation = userInput.equals("y");
        if(confirmation){
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            for(i = 1; i <= numTable; i++){
                System.out.println(i + "  |" + (i * i) + "  |" + (i * i * i));
            }
        }
    }
}
