import java.util.Scanner;

public class BoucleFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");
        int nombre = input.nextInt();
        System.out.print("Départ: ");
        int depart = input.nextInt();
        System.out.print("Arrêt: ");
        int arret = input.nextInt();

        System.out.printf("La table de multiplication du nombre %d est:\n", nombre);
        for (int compteur = depart; compteur <= arret; compteur++) {
            int produit = nombre * compteur;
            System.out.printf("%d X %d = %d\n", compteur, nombre, produit);
        }
    }
}
