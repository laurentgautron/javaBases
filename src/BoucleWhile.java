import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        // définition du codePIN
        System.out.print("Veuillez définir un code pin: ");
        int codePIN = input.nextInt();
        // essayer de déverouiller le téléphone avec le code PIN
        int codePINATester;
        while (true) {
            System.out.print("Veuillez entrer un code PIN pour dévérouiller l'appareil: ");
            codePINATester = input.nextInt();
            if (codePINATester == codePIN) {
                System.out.println("##############################");
                System.out.println("#### Appareil déverouillé ####");
                System.out.println("##############################");
                break;
            }
            System.out.println("Code PIN erroné, veuillez reessayer");
            }
        }

    }
}
