public class AffichageTableaux {
    public static void main(String[] args) {

        int[] T1 = {2, 6, 8, 15, 39, 11};
        int[] T2 = {21, 33, 12, 19, 0};
        int[] T3 = {17, 18, 46};

        int sommeMultiple = 0;
        // tableau T1
        for ( int index = 0; index < T1.length; index++) {
            //String operateur = index == 0 ? "" : "+ ";
            if (T1[index] % 3 == 0) {
                sommeMultiple += T1[index];
                System.out.printf("%d + ", T1[index]);
            }
            //sommeMultiple += chiffre % 3 == 0 ? chiffre : 0;
        }

        // tableau T2
        for ( int index = 0; index < T2.length; index++) {
            if (T2[index] % 3 == 0) {
                sommeMultiple += T2[index];
                System.out.printf("%d + ", T2[index]);
            }
        }

        // tableau T3
        for ( int index = 0; index < T3.length; index++) {
            String operateur = index == 1 ? "" : "+ ";
            if (T3[index] % 3 == 0) {
                sommeMultiple += T3[index];
                System.out.printf("%d %s", T3[index], operateur);
            }
        }

        System.out.println("\nLa somme des multiple de 3 de tous les tableaux est: " + sommeMultiple);

    }
}
