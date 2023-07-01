package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        // 함수형 인터페이스를 사용하는 이유
        // 자바의 람다식은 함수형 인터페이스로만 접근 가능
        // 람다식으로 만든 객체에 접근하기 위해 함수형 인터페이스를 사용
        KRWConverter converter =new KRWConverter();
        // converter.convert(2);

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1);

        // 함수형 인터페이스 : 인터페이스에 추상 메소드가 1개만 있어야 한다.
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 2);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("3 달러 = 4200 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 4;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
        c2.convert(5, 1400);

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (d, w) -> d * w;
        int result = c3.convert(6, 1400);
        System.out.println("6 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
