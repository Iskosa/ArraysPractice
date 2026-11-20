import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    double x = reader.nextDouble();

    System.out.print("Введите второе число: ");
    double y = reader.nextDouble();

    System.out.print("Введите операцию: + - * / : ");
    char z = reader.next().charAt(0); 

    if (z == '+'){
        System.out.println(x+y);
    } else if(z=='-'){
        System.out.println(x-y);
    } else if (z=='*'){
        System.out.println(x*y);
    } else if (z=='/'){
        System.out.println(x/y);
    } else if (y==(0)){
        System.out.println("На ноль делить нельзя");
    }
}}