import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Vôtre âge: ");
        byte age = input.nextByte();
        boolean estMajeur = age >= 18;
        if (estMajeur) {
            System.out.println("Vous êtes majeur dans certains pays");
        } else {
            System.out.println("Vous êtes mineur");
        }

        // test égalité
        int a = 1, b = 2;
        if (a == b) {
            System.out.println("a et b sont égaux");
        } else {
            System.out.println("a et b sont différents");
        }
    }
}
