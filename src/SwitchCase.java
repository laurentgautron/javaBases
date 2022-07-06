import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez rentrer un pays : ");
        String pays = input.nextLine();
        // utilisé uniquement dans les cas d'églité
        // ici il se base sur la valeur et pas sur la référence
        // il faut une comparaison de valeurs
        switch (pays) {
            case "France" :
                System.out.println("Bonjour");
                break;
            case "Espagne" :
                System.out.println("Hola");
                break;
            case "Allemagne" :
                System.out.println("Guten tag");
                break;
            case "Angleterre" :
                System.out.println("Hello");
                break;
            default:
                System.out.println("Pays non reconnu");
        }
    }
}
