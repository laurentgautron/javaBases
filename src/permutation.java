public class permutation {
    public static void main(String[] args) {
        int a = 51;
        int b = 876;
        int c = 235;
        System.out.printf("a: %d\nb: %d\nc: %d\n", a, b, c);
        int d = c;
        c = b;
        b = a;
        a = d;
        System.out.printf("a: %d\nb: %d\nc: %d", a, b, c);
    }
}
