package grades;

import java.util.Scanner;

public class CommandLineInterface {

    public static void main(String[] args) {

        student peter = new student("Peter");
        peter.addGrade(95);
        peter.addGrade(93);
        peter.addGrade(99);
        System.out.println(peter.grades);
        System.out.println(peter.getGradeAverage());

        student inara = new student("Inara");
        inara.addGrade(100);
        inara.addGrade(100);
        inara.addGrade(99);

        student wash = new student("Wash");
        wash.addGrade(74);
        wash.addGrade(65);
        wash.addGrade(91);

        student mal = new student("Malcolm");
        mal.addGrade(54);
        mal.addGrade(23);
        mal.addGrade(62);



        System.out.println("Welcome");
        System.out.println(" ");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println(" ");
        System.out.println("|PeterHollman|      |InaraSerra|     |HobanWashburne|     |MalcolmReynolds|");
        System.out.println(" ");

do {
        System.out.println("Would you like information on a student");
        Scanner check = new Scanner(System.in);
        String newInput = check.nextLine();
        if(newInput.contains("y")){

        System.out.println("What Student would you like more information on?");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();
            if(userInput.toLowerCase().contains("peter")){
                System.out.println("Peter's grades are:");
                System.out.println(peter.grades);
            } else if(userInput.toLowerCase().contains("inara")){
                System.out.println("Inara's grades are:");
                System.out.println(inara.grades);
            } else if(userInput.toLowerCase().contains("wash")){
                System.out.println("Wash's grades are");
                System.out.println(wash.grades);
            } else if(userInput.toLowerCase().contains("mal")){
                System.out.println("Malcolm's grades are:");
                System.out.println(mal.grades);
            } else{
                System.out.println("That's not one of our students, try again");
            }
        } else {
            System.out.println("Goodbye. Have a nice day");
            break;
        }
} while(true);
    }
}