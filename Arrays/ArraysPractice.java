import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int totalOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                totalOdd += numbers[i];
            }
        }
        System.out.println("Total odd: " + totalOdd);







        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int secretNumber = 4;
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] == secretNumber) {
                System.out.println("Secret's index: " + i);
                break; 
            }
        }







        int[] numbers3 = {1, 2, 3, 4, 5};
        int[] numbers4 = new int[numbers3.length]; 
        for (int i = 0; i < numbers3.length; i++) {
            numbers4[i] = numbers3[i];
        }
        System.out.println("Array, that was copied: " + Arrays.toString(numbers4));






        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a size: ");
        int size = scanner.nextInt();
        int [] numbers5 = new int[size];

        for(int i = 0; i<size;i++){
            System.out.println("Enter a number: ");
            numbers5[i] = scanner.nextInt();
            
        }
        for(int i : numbers5){
            System.out.println(i);
        }




        String[] top3 = new String[3];

        System.out.println("Enter your top 3 favorite movies:");
        for (int i = 0; i < top3.length; i++) {
            System.out.print("Movie " + (i + 1) + ": ");
            top3[i] = scanner.nextLine();
        }

        System.out.println("Your top 3 movies:");
        for (String movie : top3) {
            System.out.println(movie);
        }
    }
}