package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java, Python and C. But I love Java more.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // 모든 " and"를 ","로 변환 => I like Java, Python, C. But I love Java more.
        System.out.println(s.substring(7)); // 7번 위치부터 시작 => Java, Python and C. But I love Java more.
        System.out.println(s.substring(s.indexOf("Java"))); // Java의 위치인 7번 위치부터 시작 => Java, Python and C. But I love Java more.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치부터 끝 위치 직전까지 => Java, Python and C

        // 공백 제거
        s = "            I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 모든 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + ", " + s2); // Java, Python
        System.out.println(s1.concat(", ").concat(s2)); // Java, Python

    }
}
