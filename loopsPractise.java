import java.util.Scanner;

public class loopsPractise {

    public static void main (String arg[]){
        int i= 1;
        while(i<=1000){
            i*=10;
            System.out.println(i);
        }
        for(i=1;i<=1000;i*=10){
            System.out.println(i);
        }

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = reader.nextInt();

        for(int r = 0;r<n;r++){
            System.out.println(r);
        }
        
        int j = 2;
        while(j>1){
            j++;
            System.out.println(j);
        }
    }
}