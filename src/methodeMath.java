public class methodeMath {
    public static void main(String[] args) {
        // surface = rayon * rayon * pi
        // première approche: sans classe utilitaire math
        double rayon = 5.555;
        // final : pour une constante et en majuscule, seul endroit où on peut mettre des underscore
        // final double ACCELERATION_PESANTEUR = 9.81
        final double PI = 3.14;
        double surface = rayon * rayon * PI;
        // approche : avec methode math.pow ( puissance )
        double surface2 = Math.pow(rayon, 2) * Math.PI;
        System.out.println(surface2);

        // calcul racine carrée
        double racineDe9 = Math.sqrt(9);
        System.out.println(racineDe9);
    }
}
