package homework;
import java.util.Scanner;

public class calSwitch {
    public static void main(String[]arg){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double first = reader.nextDouble();

        System.out.println("Enter second number: ");
        double second = reader.nextDouble();

        System.out.println("Enter an operation: + - * / ");
        String operation = reader.next();

        switch (operation) {
            case "+":
                System.out.println(first+second);
        switch (operation) {
            case "-":
                System.out.println(first-second);
        }
        switch (operation) {
            case "*":
                System.out.println(first*second);}
        }
        switch (operation) {
            case "/":
                System.out.println(first/second);
                
                break;
        }
        }
    }

