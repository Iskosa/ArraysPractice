package homework;
import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = reader.nextInt();
        if(number%2==0){
            System.out.println("Your number is odd");
        } else{
            System.out.println("Your number is even");
        }
    }
}
