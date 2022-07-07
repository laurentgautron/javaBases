import java.util.Scanner;

public class RechercheElementsTableaux {
    public static void main(String[] args) {
        // 12,45,6,7,12,23,33,6,22,3,6
        int[] tableau = new int[11];
        Scanner input = new Scanner(System.in);

        // saisie des données
        for (int index = 0; index < tableau.length; index++) {
            System.out.printf("Saisir l'élément n° %d du tableau: ", index+1);
            tableau[index] = input.nextInt();
        }

        // recherche d'un élément
        int elementRecherche;
        int compteurElement = 0;
        System.out.print("Saisir un élément à rechercher: ");
        elementRecherche = input.nextInt();
        // un for de cette façon ne permet pas de modifier des éléments du tableau
        for (int element : tableau) {
            if (element == elementRecherche) {
                compteurElement++;
            }
        }

        // affichage compteurElement
        if (compteurElement == 0) {
            System.out.println("Cet élément n'existe pas dans le tableau");
        } else {
            System.out.printf("%d existe et se retrouve %d fois dans le tableau", elementRecherche, compteurElement);
        }
    }
}
