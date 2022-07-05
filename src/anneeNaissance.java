import java.util.Date;
import java.util.Scanner;

public class anneeNaissance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quelle est votre age ? ");
        int age = input.nextInt();
        Date now = new Date();
        int anneeNaissance = now.getYear() - age;
        System.out.printf("Votre année de naissance est: %d", anneeNaissance);
    }
}
