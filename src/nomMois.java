import java.util.Scanner;

public class nomMois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombre entre 1 et 12 : ");
        int mois = input.nextInt();


        switch (mois) {
            case 1 :
                System.out.println("Mois de Janvier");
                break;
            case 2 :
                System.out.println("Mois de Février");
                break;
            case 3 :
                System.out.println("Mois de Mars");
                break;
            case 4 :
                System.out.println("Mois d'Avril");
                break;
            case 5 :
                System.out.println("Mois de Mai");
                break;
            case 6 :
                System.out.println("Mois de Juin");
                break;
            case 7 :
                System.out.println("Mois de Juillet");
                break;
            case 8 :
                System.out.println("Mois d'Août");
                break;
            case 9 :
                System.out.println("Mois de Septembre");
                break;
            case 10 :
                System.out.println("Mois de Octobre");
                break;
            case 11 :
                System.out.println("Mois de Novembre");
                break;
            case 12 :
                System.out.println("Mois de Décembre");
                break;
            default:
                System.out.println("Ce mois n'existe pas");
        }

    }
}
