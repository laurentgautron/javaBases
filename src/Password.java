import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        int nbTentatives = 5;
        int compteur = 5;
        while(true) {
            System.out.printf("Il vous reste %d tentatives !\n", compteur);
            System.out.print("Entrez votre email: ");
            String emailAChercher = input.nextLine();
            System.out.print("Entrez le Mot De Passe: ");
            String motDePasseAChercher = input.nextLine();
            compteur--;
            if (compteur == 0) {
                System.out.printf("vous avez les mauvais identifiants %d fois", nbTentatives);
                break;
            }
            if (!motDePasseAChercher.equals(password) || !emailAChercher.equals(email)) {
                System.out.println("Identifiants incorrects");
            } else {
                System.out.println("Bienvenu dans votre espace client");
                break;
            }
        }
    }
}
