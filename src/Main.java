import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        System.out.println("Введите x");
        double x = sc.nextDouble();
        System.out.println("Введите y");
        double y = sc.nextDouble();
        double a = Math.sqrt(((x+y)/Math.log10(x*x))*n);
        double c = Math.atan(x/y)+ Math.abs(x*x*x*Math.sqrt(n*y));
        System.out.println(a);
        System.out.println(c);
        }
    }
