import java.util.Scanner;

public class MatricePas {

    static void displayMatrice(int number) {

        String mat = "";
        for (int i = 1; i < number + 1; i++) {
            if (number == 0) {
                System.out.println("");;
            } else {
                // ternaire pour espace : pas d'espace sur la dernière ligne
                String esp = i == number ? "" : " ";
                mat +=  "#";
                System.out.println("'" + mat + esp + "'");
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un pas: ");
        int nombrePas = input.nextInt();

        displayMatrice(nombrePas);
    }
}
