package chap_06;

public class _02_Parameter {
    // 매개변수, Parameter
    public static void power(int num) {
        int result = num * num;
        System.out.println(num + " 의 2 승은 " + result);
    }

    public static void powerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 매개변수, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument, 전달인자, 인자
        power(2);
        power(3);

        powerByExp(2, 3); // 2의 3승은 8
        powerByExp(2, 0); // 2의 3승은 8
    }
}
