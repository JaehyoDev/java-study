package chap_10;

// 퀴즈 10
// 스트림을 이용하여 미술관 방문 손님에게 적절한 입장료를
// 안내하는 프로그램을 작성하시오.

// 조건
// 1. 손님 이름 및 나이 정보를 위한 Customer 클래스 생성
// 2. 입장료는 1인당 5000원으로 고정
// 3. 20세 이상의 손님들에게만 입장료 부과 (그 외에는 무료)
// 4. 모든 클래스는 하나의 파일에 정의
// 챈들러 : 50세, 레이첼 : 42세, 모니카 : 21세, 벤자민 : 18세, 제임스 : 5세

// 실행결과
// 미술관 입장료
// ---------------
// 챈들러 5000원
// 레이첼 5000원
// 모니카 5000원
// 벤자민 무료
// 제임스 무료

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 힌트
// map()을 이용하여 원하는 형태로 데이터 가공
// 삼항연산자 (int max = a > b ? a : b;)
public class _Quiz_10 {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러", 50));
        list.add(new Customer("레이첼", 42));
        list.add(new Customer("모니카", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("---------------");

        list.stream()
                .map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
