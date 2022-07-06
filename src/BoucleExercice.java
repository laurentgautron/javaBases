import java.util.Scanner;

public class BoucleExercice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codePIN;
        while (true) {
            System.out.print("Veuillez définir un code PIN : ");
            codePIN = input.nextInt();
            if (String.valueOf(codePIN).length() == 4) {
                System.out.println("Code PIN défini avec succès");
                break;
            }
            System.out.println("Erreur : Le code PIN doit être composé de 4 chiffres");
        }


        int codePINATester;
        int nombreDeTentatives = 0;
        while (true) {
            System.out.print("Entrer un code PIN pour déverouiller l'appareil " +
                    ": ");
            codePINATester = input.nextInt();//1234
            nombreDeTentatives++;
            if (codePINATester == codePIN) {
                System.out.println("**************************");
                System.out.println("** Appareil déverouillé **");
                System.out.println("**************************");
                break;
            }
            if (nombreDeTentatives == 3) {
                System.out.printf("Votre compte est bloqué suite à %d tentatives sans " +
                        "success.\n", nombreDeTentatives);
                break;
            }

            System.out.println("Code PIN Erroné.Veuillez reessayer");
        }
    }
}
