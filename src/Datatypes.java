public class Datatypes {
    public static void main(String[] args) {

        // chaînes de caractères
        String prenom = "Laurent";
        String nom = "GAUTRON";

        // caractères: guillemets simples
        char genre = 'm';
        // Réels: rajouter un F ou f pour que java accepte le float, sinon il considère que c'est un double
        float poids = 85.5F;
        float tjm = 8.4F;

        // Réels double précision
        double v = 45.3;

        // Byte : une variante d'entier court
        byte age = 89;

        System.out.println("je suis "+ prenom + " " + nom + ", j'ai " + age + " ans. Mon tjm est de " + tjm + " euros");
    }
}
