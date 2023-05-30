package chap_06;

public class _06_WhenToUse {
    // 메소드 내에서 또 다른 메소드 호출
    // 메소드의 정의가 아직 없는데도 메소드를 쓸 수는 있다니...
    public static int getPower(int num) {
        return getPower(num, 2);
    }

    public static int getPower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 코드의 중복을 피해 양을 줄인다.

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 2 * 2 = 4

        // 3의 3승을 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 4 * 4 = 16

        // 위의 코드를 3줄로 줄인다.
        System.out.println(getPower(2, 2)); // 2 * 2 = 4
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
        System.out.println(getPower(4, 2)); // 4 * 4 = 16

        // 메소드 내에서 또 다른 메소드 호출
        System.out.println(getPower(4));
    }
}
