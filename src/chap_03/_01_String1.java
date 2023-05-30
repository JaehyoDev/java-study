package chap_03;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java, Python and C. But I love Java more.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

         // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함되면 true
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 포함할 때 위치는 7
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 위치는 -1
        System.out.println(s.indexOf("Java")); // 포함할 때 처음 위치는 7
        System.out.println(s.lastIndexOf("Java")); // 포함할 때 마지막 위치는 38
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true
    }
}
