import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your points to get your status: ");
        
        System.out.println("Enter attendance points: ");
        int attendance = reader.nextInt();

        System.out.println("Enter homework points: ");
        int homework = reader.nextInt();

        System.out.println("Enter exam points: ");
        int exam = reader.nextInt();

        double total = 0;
        total = (attendance+homework+exam)/3;
        if(total>65 && attendance>=6 && exam>=0){
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }
    }
}
