public class StringType {
    public static void main(String[] args) {
        String phrase = "je suis développeur";

        // afficher la taille de la phrase: ici c'est la méthode length ( pour les string )
        System.out.println("Taille de la chaine phrase: " + phrase.length());

        // affichage de la première lettre
        System.out.println("Afficher la lettre à la position 0: " + phrase.charAt(0));

        // trouver la position d'un caractère: retourne la première occurence ( on passe un caractère = guilllemets simples )
        System.out.println("La position de la première occurence de s: " + phrase.indexOf('s'));

        // afficher le dernier élément de la chaine
        int taille= phrase.length();
        System.out.println("Afficher le dernier élément de la chaine: " + phrase.charAt(taille - 1));

        // extraire une sous-chaine
        String dev = phrase.substring(8, 18); // il manque le r: [début, fin[
        System.out.println(dev);
    }
}
