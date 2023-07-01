package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스 : 기본 자료형을 객체로 만든다.
        // 기본 자료타입을 객체로 다루기 위해서 사용하는 클래스
        // int double float char

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println(" ----- ----- ----- ----- ");

        System.out.println(i.intValue()); // 값 그대로 출력
        System.out.println(d.intValue()); // 실수를 정수로 형변환
        System.out.println(c.charValue()); // 값 그대로 출력

        String s = i.toString(); // 정수를 문자열로 형변환
        System.out.println(s);
    }
}
