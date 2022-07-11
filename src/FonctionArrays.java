import java.util.Arrays;

public class FonctionArrays {
    /*{1, 2, 3, 4, 5}
    {6, 7, 8, 9, 10}
    {7, 8, 9, 11, 13, 15}*/
    // les tableaux ont la même taille !! pour cet exemple volontairement
    static int[] produceSumArray(int[] tableauNombre1, int[] tableauNombre2) throws Exception {

        // on lève une exception si les tableaux ne sont pas de même taille
        if  (tableauNombre1.length != tableauNombre2.length) {
            throw new Exception("Les deux tableaux n'ont pas la même taille");
        }

        int taille = tableauNombre1.length;
        int[] tableauResultant = new int[taille];// cellules initialisées à 0
        for (int i = 0; i < taille; i++) {
            tableauResultant[i] = tableauNombre1[i] + tableauNombre2[i];
        }
        return tableauResultant;
    }

    public static void main(String[] args) {

        int[] tb1 = {1, 2, 3, 4, 5};
        int[] tb2 = {6, 7, 8, 9, 10};
        try {
            int[] tbResultant = produceSumArray(tb1, tb2);
            System.out.println(Arrays.toString(tbResultant));
        } catch (Exception err) {
            System.out.println("Erreur => " + err);
        }
    }
}
