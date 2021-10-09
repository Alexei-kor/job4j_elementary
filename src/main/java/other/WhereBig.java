package other;

public class WhereBig {
    /**
     * Метод для сравнения трех числе и поиск максимального из них. Рассматриваемые комбинации: 123, 231, 312, 132, 321, 213
     *
     * @param args не используется
     */
    public static void main(String[] args) {
        int a, b, c;

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
