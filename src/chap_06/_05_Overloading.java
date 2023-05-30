package chap_06;

public class _05_Overloading {
    public static int getPower(int num) {
        int result = num * num;
        return result;
        // return num * num;
    }

    public static int getPower(String strNum) {
        int num = Integer.parseInt(strNum);
        return num * num;
    }

    public static int getPower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러번 선언하는 것
        // 1. 전달값의 타입이 다른 경우
        // 2. 전달값의 개수가 다른 경우
        // 반환형이 다른 중복된 메소드의 이름은 불가능하다.
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3,3)); // 3 * 3 * 3 =
    }
}
