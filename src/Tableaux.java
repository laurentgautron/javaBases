public class Tableaux {
    public static void main(String[] args) {
        float[] notes = {15.5F, 18.2F, 13.2F, 10, 14.6F};
        // float[] notes = new float[5]; pour déclarer un tableau de 5 cellules, mais taille fixe

        // affichage
        // autre façon d'afficher
        // for (float note : notes); {
        //        System.out.println(note);
        //}
        for (int index = 0; index < notes.length; index++) {
            System.out.println(notes[index]);
        }

        // calcul de la sommme
        float sommeNotes = 0;
        for (int index = 0; index < notes.length; index++) {
            sommeNotes += notes[index];
        }
        System.out.println("somme: " + sommeNotes);

        // calcul de la moyenne
        float moyenne = sommeNotes / notes.length;
        System.out.println("moyenne: " + moyenne);
    }
}
