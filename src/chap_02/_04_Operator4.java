package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean a = false;
        boolean b = false;
        boolean c = true;

        System.out.println(a || b || c); // true
        System.out.println(a && b && c); // false

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // false

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // true
        System.out.println((5 > 3) || (3 < 1)); // true
        System.out.println((5 < 3) || (3 < 1)); // false

        // System.out.println(1 < 3 < 5); // 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
