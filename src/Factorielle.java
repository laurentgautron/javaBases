import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int nombre = input.nextInt();
        int factoriel = 1;
        if (nombre != 0) {
            while (nombre != 0) {
                System.out.printf("%d x ", nombre);
                factoriel *= nombre;
                nombre--;
            }
            System.out.printf("\nLe factoriel est: %d", factoriel);
        } else {
            System.out.println("Le factoriel est 1");
        }
    }
}
