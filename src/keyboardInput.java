// pour lire les entrées au clavier
import java.util.Scanner;

public class keyboardInput {
    public static void main(String[] args) {
        // demander à l'utilisateur :nom prenom, age ,poids
        Scanner input = new Scanner(System.in);
        System.out.print("Votre nom: ");
        // pour lire toute la ligne
        String nom = input.nextLine();
        System.out.print("Votre prenom: ");
        String prenom = input.nextLine();
        System.out.print("Votre âge: ");
        Byte age = input.nextByte();
        System.out.print("Votre poids: ");
        float poids = input.nextFloat();

        System.out.printf("nom: %s \nprenom: %s\nâge: %d\npoids: %.2f", nom, prenom, age, poids);
    }
}
