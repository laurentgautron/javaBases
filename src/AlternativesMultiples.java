import java.util.Scanner;

public class AlternativesMultiples {
    public static void main(String[] args) {
        // demander d'entrer le nom d'un pays
        // si nom de pays = France alors afficher "Bonjour"
        // sinon si pays = Espagne alors "Hola"
        // sinon si allemagne => "Guten tag"
        // sinon si Angleterre => "Hello"
        // sinon =>pays non reconnu
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez rentrer un pays : ");
        String pays = input.nextLine();
        if ( pays.equals("France") ) {
            System.out.println("Bonjour");
        } else if (pays.equals("Espagne")) {
            System.out.println("Hola");
        } else if (pays.equals("Allemagne")) {
            System.out.println("Guten tag");
        } else if (pays.equals("Angleterre")) {
            System.out.println("Hello");
        } else {
            System.out.println("Pays non reconnu");
        }
    }
}
