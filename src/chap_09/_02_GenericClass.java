package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

import java.sql.SQLOutput;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        // 하나의 클래스에서 서로 다른 형태의 데이터를 받아 한꺼번에 처리 가능
        // 코드 중복 줄이기, 형변환도 없어서 개발 상의 실수를 줄일 수 있음

        System.out.println(" ----- ----- int, String ----- ----- ");

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("톰");
        c2.ready();

        System.out.println(" ----- ----- Object Type ----- ----- ");

        CoffeeByName c3 = new CoffeeByName(34);
        // CoffeeByName c3 = new CoffeeByName("삼십사");
        // 실수로 문자열을 정수에 넣은 경우
        // 오류 표시가 없지만 실행 시, 문자열 -> 정수는 형변환 불가
        // 그래서 제네릭 클래스가 필요하다.
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("제리");
        c4.ready();

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name; 실수로 정수를 문자열에 넣은 경우
        // 오류 표시가 없지만 실행 시, 정수 -> 문자열은 형변환 불가
        // 그래서 제네릭 클래스가 필요하다.

        System.out.println(" ----- ----- Generic Class ----- ----- ");

        Coffee<Integer> c5 = new Coffee<>(35);
        // Coffee<Integer> c5 = new Coffee<>("도그"); 정수를 받아야하는데 문자열이 들어와서 바로 오류 표시가 나온다.
        c5.ready();

        Coffee<String> c6 = new Coffee<>("도그");
        c6.ready();

        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        // c6Name = (String) c5.name; 오류 표시가 바로 나온다.

        System.out.println(" ----- ----- Generic Class ----- ----- ");
        System.out.println(" ----- A클래스를 상속받는 클래스로 제한할 때 ----- ");
        System.out.println(" ----- CoffeeByUser 클래스에서 <T extends A클래스> 처럼 작성 ----- ");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("캣"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("래빗"));
        c8.ready();

        // CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox()); BlackBox클래스는 User를 상속받지 않아 에러

        System.out.println(" ----- ----- Generic Method ----- ----- ");
        orderCoffee("지라프");
        orderCoffee(5);
        orderCoffee("라이언", "아메리카노");
        orderCoffee("타이거", "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}

class BlackBox {

}