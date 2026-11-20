package homework;
import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = reader.nextInt();
         if(age>=18){
            System.out.println("You can vote");
         }else if(age<0){
            System.out.println("Error");
         }else if (age>100){
                System.out.println("You can't vote");
            }
         else{
                System.out.println("You can't vote");
         }
    }
}
