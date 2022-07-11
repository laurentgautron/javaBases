import java.util.Scanner;

public class RechercheCaracteres {

    static Boolean subsequentOccurences(String chaine) {


        String chaineATester = chaine.replace(" ", "").toLowerCase();
        for (int i = 0; i < chaine.length() - 1; i++) {
            if (chaineATester.charAt(i) == chaineATester.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer une chaîne de caractères: ");
        String chaine = input.nextLine();

        System.out.println(subsequentOccurences(chaine));
    }
}
