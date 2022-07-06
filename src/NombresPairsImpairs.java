import java.util.Scanner;

public class NombresPairsImpairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");
        int nombre = input.nextInt();
        // test positif ou négatif
        if (nombre > 0) {
            System.out.print("Le nombre  est positif et");
        } else if (nombre < 0) {
            System.out.print("Le nombre est négatif et");
        } else {
            System.out.print("Le nombre est zéro et ");
        }
        // test p   air ou impair
        if (nombre % 2 == 0) {
            System.out.print(" pair");
        } else {
            System.out.print(" impair");
        }
    }
}
