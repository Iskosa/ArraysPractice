package homework;
import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = reader.nextInt();

        System.out.println("Enter your monthly income: ");
        int monthlyIncome = reader.nextInt();

        System.out.println("Enter your credit score(0-100): ");
        int creditScore = reader.nextInt();
        

        System.out.println("Enter your number of years at current job: ");
        int numberBackground = reader.nextInt();

        System.out.println("Do you have an existing  debt: ");
        String exitingDebt = reader.next();

        

        if(age>21 && age<65 && monthlyIncome>=30000 && creditScore>=70 && numberBackground>=2 && exitingDebt.equals("no")){
            System.out.println("You're applied");
        } else {
            System.out.println("You're rejected");
        }
    }
}
