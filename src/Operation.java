public class Operation <A, B> {

    public static void m1(operation <?,?> p) {
        System.out.println(p);
    }
    public static void m2(operation <?,?> p) {
        System.out.println(p);
    }

    public static void main(String[] args) {
        Operation <String, Integer> o1 = new Operation <> ();
        Operation <String, Integer> o2 = new Operation <> ();
        m1(o1);
        m1(o2);
        m2(o1);
        m2(o2);
    }
}
