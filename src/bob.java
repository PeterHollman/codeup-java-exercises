import java.util.Scanner;

public class bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob is sitting quietly");
        do {

            String input = scanner.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out");
            } else if (input.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (input.equalsIgnoreCase("bye")){
              break;
            } else {
                System.out.println("Whatever");
            }
        } while (true);
    }
}
