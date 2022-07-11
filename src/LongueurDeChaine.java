import java.util.Scanner;

public class LongueurDeChaine {

    static String getUserInput(String request, int min, int max) {

        Scanner input = new Scanner(System.in);
        System.out.println(request);
        String response = input.nextLine();
        while(longueurChaine(response, min, max) == 0) {
            System.out.println("La Longueur de la chaine n'est pas bonne");
            response = input.nextLine();
        }
        return response;
    }

    static String getUserEmail(String email) {
        return "";
    }

    static int longueurChaine(String chaine, int min, int max) {

        int tailleChaine = chaine.length();
        return min < tailleChaine && tailleChaine < max ? 1 : 0;
    }

    public static void main(String[] args) {

        String pseudo = getUserInput("Entrer le Pseudo: ", 5, 10);
        String nom = getUserInput("Entrer le Nom: ", 4, 30);
        String prenom = getUserInput("Entrer le prénom", 2, 30);
        String motDePasse = getUserInput("Entrer le Mot De Passe", 8, 50);
        String Email = getUserEmail("Entrer le Pseudo");


    }
}
