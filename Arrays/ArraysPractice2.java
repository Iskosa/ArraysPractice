import java.util.Scanner;

public class ArraysPractice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1. Count Positive, Negative, and Zero Values
        int[] numbers = {5,-3,0,8,-1,0,12,-7,4,2};
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers= 0;

        for(int el : numbers){
            if(el==0){
                zeroNumbers++;
            }
            else if(el<0){
                negativeNumbers++;
            }
            else {
                positiveNumbers++;
            }
        }
        System.out.print("Array: ");
        for(int el : numbers){
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Positive: " + positiveNumbers);
        System.out.println("Negative: " + negativeNumbers);
        System.out.println("Zero: " + zeroNumbers);
        System.out.println();



        //Task 2. Largest and Smallest Elements


        int[] numbers2 = {12,5,28,3,19,7,15,9};
        int largestNumber = numbers2[0];
        int largestNumberIndex = 0;
        int smallestNumbers = numbers2[0];
        int smallestNumbersIndex = 0;
        System.out.print("Array2: ");
        for(int el : numbers2){
            System.out.print(el + " ");
        }
        for(int i = 0;i<numbers2.length;i++){
            if(numbers2[i]<smallestNumbers){
                smallestNumbers = numbers2[i];
                smallestNumbersIndex = i;
            }
            else if(numbers2[i]>largestNumber){
                largestNumber = numbers2[i];
                largestNumberIndex = i;
            }
        }
        System.out.println();
        System.out.println("Largest: " + largestNumber + " at index " + largestNumberIndex);
        System.out.println("Smallest: " + smallestNumbers + " at index " + smallestNumbersIndex);
        System.out.println();



        //Task 3. Numbers Greater Than the Average


        int[] numbers3 = {10,20,30,40,50,60};
        int total = 0;
        double average = 0;
        int numbersAboveAverage = 0;
        for(int el : numbers3){
            total += el;
        }
        average = total/numbers3.length;
        for(int el : numbers3){
            if(el>average){
                numbersAboveAverage++;
            }
        }

        System.out.print("Array3: ");
        for(int el : numbers3){
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " +numbersAboveAverage);
        System.out.println();



        //Task 4. Print an Array in Reverse Order


        int[] numbers4 = {3,8,12,5,9,2,7};
        System.out.print("Original: ");
        for(int el : numbers4){
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.print("Reversed: ");
        for(int i = numbers4.length-1;i>=0;i--){
            System.out.print(numbers4[i]+ " ");
        }
        System.out.println();
        System.out.println();


        //Task 5. Student Test Scores



        int[] numbers5 = new int[5];
        int passed = 0;
        int failed = 0;
        int sum = 0;


        for (int i = 0; i < numbers5.length; i++) {
            System.out.print("Enter score #" + (i + 1) + " (0-100): ");
            int score = scanner.nextInt();

            while (score < 0 || score > 100) {
                System.out.print("Invalid score! Please enter a value between 0 and 100: ");
                score = scanner.nextInt();
            }

            numbers5[i] = score;
        }


        System.out.print("Scores: ");
        for (int score : numbers5) {
            System.out.print(score + " ");
            sum += score;

            if (score >= 60) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println();

        double average2 = (double) sum / numbers5.length;

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average2);




    }
}