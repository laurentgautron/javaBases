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
    // autre façon:
    // utile si on ne se sert de la parite seulement très peu de fois
    // String Parite = nombre % 2 ? "paire" : "impair";
    // if (nombre > 0) {
    //    System.out.println("%d est positif et %s", nombre, parite);
    //} else if (nombre < 0) {
    //    System.out.println("%d set négatif et %s", nombre, parite);
    //} else {
    //    System.out.println("0 et pair");
    //}
    // ou encore faire boolean estPair = nombre % 2 == 0
    // puis System.out.println("%d est positif et %s", nombre, estPaire ? "pair" : "impair");

}
