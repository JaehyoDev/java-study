package chap_03;

public class _03_StringComparison {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false

        // 대소문자 구분 없이 문자열 내용이 같은지 체크
        System.out.println(s2.equalsIgnoreCase("python")); // true

        // 문자열 비교 심화
        // 결론: 자바에서 문자열의 내용을 비교하러면 equals()를 사용한다.
        s1 = "1234";
        s2 = "1234"; // 같은 내용이니 같은 메모리 주소를 참조한다...
        System.out.println(s1.equals(s2)); // true 내용을 비교한다.
        System.out.println(s1 == s2); // true 참조가 같은 지를 비교한다.

        // 서로 다른 메모리 주소를 가진다.
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
}
