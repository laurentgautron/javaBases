import java.util.Random;
import java.util.Scanner;

public class NombreAleatoires {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100);
        //System.out.println("nombre: " + nombre);
        System.out.print("Entrez un nombre entier: ");
        while (true) {
            int nombreEntre = input.nextInt();
            if (nombreEntre < nombreAleatoire) {
                System.out.println("Entrez un nombre plus grand");
            } else if (nombreEntre > nombreAleatoire) {
                System.out.println("Entrez un nombre plus petit");
            } else {
                System.out.println("Bravo vous avez gagné");
                break;
            }
        }
    }
}
