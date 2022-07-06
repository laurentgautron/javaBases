import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");
        int nombre = input.nextInt();
        for (int compteur = 1; compteur <= nombre; compteur++) {
            if (compteur % 3 == 0 && compteur % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (compteur % 5 == 0) {
                System.out.println("Buzz");
            } else if (compteur % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(compteur);
            }
        }
    }
}
