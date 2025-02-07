import java.util.InputMismatchException;
import java.util.Scanner;

public class Phonebook{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ultimate phonebook!");
        System.out.println("What would you like to do today ?");


        int input;
        do {

            System.out.println("\nOptions: (1)add (2)delete (3)update (4)search) (5)quit");
            System.out.print("Input: ");

            try {
                input = scanner.nextInt();

            }catch (InputMismatchException e){
                input = -1;

            }

            switch (input) {
                case (1):

                    break;
                case (2):

                    break;
                case (3):

                    break;
                case (4):

                    break;
                case(5):
                    System.out.println("Thanks for using the ultimate Phonebook");
                    break;
                default:
                    System.out.println("Sorry your input was invalid would you like to try again ?");
                    scanner.next(); // Clear any dangling input
                    break;
            }
        } while (input != 5);

    }

}