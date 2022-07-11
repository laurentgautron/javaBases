import java.util.Scanner;

public class MatriceDiagonales {

    // rentre les entiers dans la matrice
    static int[][] getUserMatrice() {

        Scanner input = new Scanner(System.in);
        System.out.print("Entrer la taille de la matrice (carrée): ");

        int tailleMatrice = input.nextInt();
        int[][] matrice = new int[tailleMatrice][tailleMatrice];

        for (int i = 0; i < tailleMatrice; i++) {
            System.out.printf("Entrer les élements de ligne n°%d\n", i+1);
            for (int j = 0; j < tailleMatrice; j++) {
                System.out.printf("Élément n° %d: ", j+1);
                matrice[i][j] = input.nextInt();
            }
        }
        System.out.println(matrice);
        return matrice;
    }

    // calcule la somme des deux diagonales
    static int sommeDiagonales(int[][] matriceToSum) {

        // verifier que la matrice est carrée
        int sum = 0;
        int tailleMatrice = matriceToSum[1].length;
        for (int i = 0; i < tailleMatrice; i++) {
            sum += matriceToSum[i][i] + matriceToSum[tailleMatrice - 1 - i][i];
        }
        return sum;
    }

    public static void main(String[] args) {

        // créer la fonction qui enregistre une matrice
        int[][] userMatrice = getUserMatrice();
        // afficher la somme
        System.out.println(sommeDiagonales(userMatrice));
    }
}
