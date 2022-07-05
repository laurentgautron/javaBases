import java.util.Scanner;

public class diametre {
    public static void main(String[] args) {
        float rayon;
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer le diamètre du cercle: ");
        float diametre = input.nextFloat();
        rayon = diametre / 2;
        double surface = Math.pow(rayon, 2);
        System.out.printf("la surface est de: %.2f", surface);
    }
}
