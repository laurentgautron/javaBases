import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChainesInversees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères: ");
        String chaine = input.nextLine();

        String chaineInversee = "";

        // boucle avec décrémentation = rarement utilisée, source d'erreurs
        // une façon de faire autrement avec une boucle incrémentation
        for (int index = 0; index < chaine.length(); index++) {
            chaineInversee = chaine.charAt(index) + chaineInversee;
        }

        System.out.println("Chaine inversée: " + chaineInversee);
    }
}
