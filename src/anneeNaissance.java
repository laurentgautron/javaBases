import java.util.Calendar;
import java.util.Scanner;

public class anneeNaissance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quelle est votre age ? ");
        int age = input.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int anneeNaissance = year - age;
        System.out.printf("Votre année de naissance est: %d", anneeNaissance);
    }
}
