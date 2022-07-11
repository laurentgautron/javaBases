import java.util.Scanner;

public class NombreInverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");
        int nombre = input.nextInt();

        // le nombre en string
        String nombreString = String.valueOf(Math.abs(nombre)); // sans le signe
        int nombreInverse = 0;

        String nombreStringInverse = "";
        // inversion en string: on split le nombre string et on rajoute les lettres une par une avant le nombreStringinverse
        // chaque lettre est rajoutée avant la dernière
        for (String lettre : nombreString.split("")) {
            nombreStringInverse = lettre + nombreStringInverse;
        }

        //affichage: Math.signum = signe du nombre entier
        nombreInverse = (int)Math.signum(nombre) * Integer.parseInt(nombreStringInverse);
        System.out.println("Le nombre inverse est: " + nombreInverse);
    }
}
