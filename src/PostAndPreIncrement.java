public class PostAndPreIncrement {
    public static void main(String[] args) {
        int a = 2;
        int b = a++;
        // post incrémentation
        // 1ère étape : on effecte à b l'ancienne valeur de a (2)
        // comme l'incrémentation est faite à droite, la valeur de a va incrémenter 1
        System.out.println(a); // 3
        System.out.println(b);// 2

        // pre incrementation
        // comme l'incrémentation est faite à gauche, la valeur de x va incrémenter 1
        // on effecte à y la nouvelle valeur de x (4) après son incrémentation
        // donc x vaudra 4 et y vaudra 4
        int x = 3;
        int y = ++x;
        System.out.println("x"+x); // 4
        System.out.println("y"+y); // 4

        int c = 2;
        c = c++;
        System.out.println(c);
        // c ne change pas car c'est le souhait du concepteur de java !!

    }
}
