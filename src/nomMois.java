import java.util.Scanner;

public class nomMois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombre entre 1 et 12 : ");
        int moi = input.nextInt();


        switch (moi) {
            case 1 :
                System.out.println("Moi de Janvier");
                break;
            case 2 :
                System.out.println("Moi de Février");
                break;
            case 3 :
                System.out.println("Moi de Mars");
                break;
            case 4 :
                System.out.println("Moi d'Avril");
                break;
            case 5 :
                System.out.println("Moi de Mai");
                break;
            case 6 :
                System.out.println("Moi de Juin");
                break;
            case 7 :
                System.out.println("Moi de Juillet");
                break;
            case 8 :
                System.out.println("Moi d'Août");
                break;
            case 9 :
                System.out.println("Moi de Septembre");
                break;
            case 10 :
                System.out.println("Moi de Octobre");
                break;
            case 11 :
                System.out.println("Moi de Novembre");
                break;
            case 12 :
                System.out.println("Moi de Décembre");
                break;
            default:
                System.out.println("Ce moi n'existe pas");
        }

    }
}
