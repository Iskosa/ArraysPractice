import java.util.Scanner;

public class POS {

    public static void main(String[] args ){
        String[] goods={"Eggs","Bread","Umbrella","spoon"};
        int[] prices={150,50,500,50};
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter goods you need: ");
        for(int i=0;i<goods.length;i++){
            System.out.println((i+1 + ". " + goods[i]+" - "+ prices[i]));
        }
        System.out.print("Enter good's index: ");
        int chioce = reader.nextInt();
        int index = chioce-1;

        System.out.print("Enter good's quantity: ");
        int quantity = reader.nextInt();

        double total = prices[index]*quantity;
        System.out.println("You choose: "+ goods[index]+" | Quantity: "+quantity+" | Total: "+total);
    }
}