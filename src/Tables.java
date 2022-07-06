import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        for (int numeroTables = 2; numeroTables <=10; numeroTables++) {
            System.out.printf("Table de multiplication de %d:\n", numeroTables);
            for (int nbLignes = 1; nbLignes <=10; nbLignes++) {
                int produit = nbLignes * numeroTables;
                System.out.printf("%d x %d = %d\n", nbLignes, numeroTables, produit);
            }
        }
    }
}
