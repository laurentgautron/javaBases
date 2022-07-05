public class Datatypes {
    public static void main(String[] args) {

        // chaînes de caractères
        String prenom = "Laurent";
        String nom = "GAUTRON";
        // pascalCase : recommandé pour java
        String nomComplet = prenom = ' ' + nom;


        // caractères: guillemets simples
        char genre = 'm';
        // Réels: rajouter un F ou f pour que java accepte le float, sinon il considère que c'est un double
        float poids = 85.5F;
        float tjm = 8.4F;

        // Réels double précision
        double v = 45.3;

        // Byte : une variante d'entier court
        byte age = 89;

        // mauvaise méthode
        System.out.println("je suis "+ nomComplet + ", j'ai " + age + " ++ans. Mon tjm est de " + tjm + " euros");

        // meilleure méthode: %s = string, %d = integer, %f = float, le 1 devant = limite à 1 seul rang après la virgule
        System.out.printf("je suis %s %s, j'ai %d ans. Mon tjm est de %.1f€.\n", prenom, nom, age, tjm);
    }
}
