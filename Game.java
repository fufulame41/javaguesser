import java.util.Scanner;
import java.util.Random;


public class Game{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("quitting");
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
        int answer = random.nextInt(100) + 1;
        int guess;
        int attempt = 1;

        System.out,println("Human Guesser");
        do{
            System.out.print(attempt + ") enter a number: ");
            guess = scanner.nextInt();
            if (guess < answer){
                System.out.println("Too low");
            } 
            else if(guess > answer){
                System.out.println("Too high");
            }
            else{
                System.out.println("correct");
            }
            attempt++;
        } while(guess != answer);
        System.out.println("Awesome");
    }

    private static void computerGuesser(){
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess;
        char feedback;

        System.out.println("Computer Guesser");
        do {
            guess = (low + high) / 2;
            System.out.println("i guess " + guess);
            System.out.print("too (H)igh, too (L)ow, or (C)orrect? ");
            feedback = scanner.next().toUpperCase().charAt(0);

            if (feedback == 'H'){
                high = guess - 1;
            } else if (feedback == 'L'){
                low = guess + 1;
            } else if (feedback != 'C'){
                System.out.println("please write H, L, or C");
            }
        } while (feedback != 'C');
        System.out.println("correct");
    }
}
