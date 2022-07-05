import java.util.Scanner;

public class Degre3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();
        System.out.print("x: ");
        double x = input.nextDouble();
        double polynome = ((double)(a + b) / 2) * Math.pow(x, 3) + Math.pow((a + b), 2) * Math.pow(x, 2) + a + b + c;
        System.out.printf("Le résultat est: %.4f", polynome);
    }
}
