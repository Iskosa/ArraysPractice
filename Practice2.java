import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        /*int password = 1234;
        int attempts = 3;*/

        Scanner reader = new Scanner(System.in);

        /*while (attempts > 0) {
            System.out.println("Enter PIN: ");
            int attempt = reader.nextInt();

            if (password == attempt) {
                System.out.println("You have access");
                break;
            } else {
                attempts--; 
                if (attempts > 0) {
                    System.out.println("Incorrect PIN. You have: " + attempts + " attempts left.");
                }
            }
        }

        if (attempts == 0) {
            System.out.println("Card is blocked");
        }*/


            int secretNumber = 7;

            int attempts = 5;
            
            while(attempts>0){
                System.out.println("Enter a number: ");
                int attempt = reader.nextInt();

                if (secretNumber==attempt) {
                    System.out.println("Correct!");
                    System.out.println("You needed "+attempts + " attempts");
                    break;
                } else if (attempts>0 && attempt<secretNumber){
                    attempts--;
                    System.out.println("Too low!");
                } else if (attempts>0 && attempt>secretNumber){
                    attempts--;
                    System.out.println("Too high!");
                }
            }
            if (attempts == 0) {
            System.out.println("Game over!" );
            System.out.println("The secret numver was "+ secretNumber);
        }
    }
}