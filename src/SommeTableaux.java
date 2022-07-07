import java.util.Scanner;

public class SommeTableaux {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nbElements;
        System.out.print("Combien d'éléments pour les tableaux ? ");
        nbElements = input.nextInt();

        int[] tableau1 = new int[nbElements];
        int[] tableau2 = new int[nbElements];
        int[] sommeTableau = new int[nbElements];

        // saisie tableau1
        System.out.printf("saisie du tableau 1 (%d éléments)\n", nbElements);
        for (int index = 0; index < nbElements; index++) {
            System.out.printf("élement n° %d: ", index+1);
            tableau1[index] = input.nextInt();
        }

        // saisie tableau2
        System.out.printf("Saisie du tableau 2 (%d éléments)\n", nbElements);
        for (int index = 0; index < nbElements; index++) {
            System.out.printf("élement n° %d: ", index+1);
            tableau2[index] = input.nextInt();
        }

        // addition + affichage
        String operateur;
        System.out.print("Liste somme = [");
        for (int index = 0; index < nbElements; index++) {
            operateur = index == nbElements-1 ? "" : ", ";
            sommeTableau[index] = tableau1[index] + tableau2[nbElements - 1 - index];
            System.out.print(sommeTableau[index] + operateur);
        }
        System.out.print("]");
    }
}
