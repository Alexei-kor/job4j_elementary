package other;

public class WhereBig {

    public static void main(String[] args) {
        int a, b, c;
        // варианты 123, 231, 312, 132, 321, 213

        a = 2;
        b = 1;
        c = 3;

        if (a > b & a > c) {
            System.out.println("a");
        } else if (b > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
