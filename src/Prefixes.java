import java.util.Scanner;

public class Prefixes {

    static String getUserString( String request) {

        System.out.print(request);
        Scanner input = new Scanner(System.in);
        String chaine = input.nextLine();
        // input.close();
        return chaine;
    }

    static Boolean isPrefix(String chaine1, String chaine2) throws Exception {

        if (chaine2.length() > chaine1.length()) {
            throw new Exception("La chaine N° 2 ne peux pas être un préfixe");
        }

        String prefixe = chaine1.substring(0, chaine2.length());
        System.out.println("prefixe: " + prefixe);
        if (chaine2 .equals(prefixe)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String chaine1 = getUserString("Entrer la chaine 1: ");
        String chaine2 = getUserString("Entrer la chaine 2: ");

        boolean response = false;

        while (true) {
            try {
                response = isPrefix(chaine1, chaine2);
                System.out.println(response);
                break;
            } catch (Exception err) {
                System.out.println("Erreur => " + err);
                chaine1 = getUserString("Entrer la chaine 1: ");
                chaine2 = getUserString("Entrer la chaine 2: ");
            }
        }
    }
}
