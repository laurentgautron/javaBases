import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer le nombre a: ");
        double a = input.nextDouble();
        System.out.print("Entrer le nombre b: ");
        double b = input.nextDouble();
        System.out.print("Entrer le nombre c: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Pas de solution réelles pour l'équation");
        } else if ( delta > 0) {
            System.out.println("Il y a deux solutions:");
            double x1 = (-b - Math.sqrt(delta))/ (2 * a);
            double x2 = (-b + Math.sqrt(delta))/ (2 * a);
            System.out.println("solution 1: " + x1);
            System.out.println("solution 2: " + x2);
        } else {
            double x = -b / ( 2 * a);
            System.out.print("Une seule solution: " + x);
        }
    }
}
