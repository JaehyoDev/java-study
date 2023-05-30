package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2...
        // 2 x 9 = 18

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
