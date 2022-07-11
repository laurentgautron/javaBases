import java.util.ArrayList;

public class NombreTab2D {

    static  void displayPositions(int[][] tabPositions) {
        int tailleLignes = tabPositions.length;
        int tailleColonnes = tabPositions[1].length;
        for (int i = 0; i < tailleLignes; i++) {
            for (int j = 0; j < tailleColonnes; j++) {
                if (tabPositions[i][j] == 1) {
                    System.out.printf("( %d, %d )", i, j);
                }
            }
        }
    }

    static void positions(int[][] tab, int number) {

        int tailleLignes = tab.length;
        int tailleColonnes = tab[1].length;
        int[][] pos = new int[tailleLignes][tailleColonnes];
        int compteur = 0;
        for (int x = 0; x < tailleLignes; x++) {
            for (int y = 0; y < tailleColonnes; y++) {
                if (tab[x] [y] == number) {
                    pos[x][y] = 1;
                    compteur++;
                }
            }
        }
        System.out.printf("Le nombre %d est présent %d fois\n", number, compteur);
        displayPositions(pos);
    }

    public static void main(String[] args) {

        int[][] tab2D = {{1, 4, 2, 1}, {6, 3, 8, 9}, {1, 5, 1, 0}};
        positions(tab2D, 1);
    }
}
