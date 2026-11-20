import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        /*int someValue = 5;
        int factorial = 1;
        while(someValue>1){
            factorial*=someValue;
            someValue--;
        }
        System.out.println(factorial);

        for(int i = 1;i<someValue;i++){
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("Enter a number: ");
        int even = reader.nextInt();

        int start = 2;

        /*while (start<=even){
            System.out.println(start);
            start+=2;
        }

        for(int i =0;i<=even;i+=2){
            System.out.println(i);
        }

        for(int i =1;i<=even;i+=2){
            System.out.println(i);
        }
*/



        //fizzBuzz


        for(int i = 1;i<=20;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+"FizzBuzz");
            } else if (i%3==0){
                System.out.println(i+"Fizz");
            } else if (i%5==0){
                System.out.println(i+"Buzz");
            }

        }


    }
}


