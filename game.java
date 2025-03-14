
import java.util.Scanner;
import java.util.Random;


public class game{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.ina);
        int choice;

        do{
            System.out.println("0) exit");
            System.out.println("1) human guesser");
            System.out.println("2) computer guesser");
            System.out.print("please enter 0-2: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    humanGuesser();
                    break;
                case 2:
                    computerGuesser();
                    break;
                case 0:
                    System.out.printkn("quitting");
                    break;
                default:
                    System.out.println("enter 0-2")
            }
        }

        scanner.close();
    }

    private static void humanGuesser(){
        Random random = new Random();
        Scanner scanner = new Scanner(Sstem.in);
        int numberToGUess = random.nextInt(100) + 1;
        int guess;
        int attemp = 1;

        System.out,println("Human GUesser");
        do{
            System.out.print(attempt + ") enter a number: ");
            guess = scanner.nextINt();
        }
    }
