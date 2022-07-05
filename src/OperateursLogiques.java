import java.util.Scanner;

public class OperateursLogiques {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Vôtre âge: ");
        byte age = input.nextByte();

        // operateur logique ET/AND
        if (age >= 10 && age <= 19) {
            System.out.println("Vous êtes ado");
        } else {
            System.out.println("Vous n'êtes pas ado");
        }

        //operateur logique OU/OR
        if (age >= 10 || age <= 19) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
