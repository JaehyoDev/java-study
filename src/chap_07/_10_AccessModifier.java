package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation)
        // 객체지향프로그래밍에서의 중요한 특징 중 하나로 연관된 데이터와 함수를 논리적으로 묶어놓은 것
        // 데이터를 보호하기 위해 다른 객체의 접근을 제한하는 접근 제한 수식자의 기능을 제공

        // 정보은닉 (Information hiding)
        // 외부(다른 객체)에서 객체의 내부(데이터)를 들여다볼 수 없다는 개념
        // 다른 객체가 한 객체 내의 데이터 값을 직접 참조하거나 접근할 수 없음
        // 그러므로 메서드를 통해 객체에 요청해서 값을 넘겨받아야 한다.

        // 접근 제어자 : 클래스, 메소드, 변수에 적용 가능
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서 접근 가능, 다른 패키지인 경우 자식 클래서에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName =  "inavi";
        b1.color = "black";
        // b1.price = 200000; private 으로 접근을 제어하면 앞의 코드는 사용 불가
        b1.setPrice(200000); // private 으로 접근을 제어했기 때문에 setter를 이용하여 가격 설정

        // 할인 행사
        // b1.price = b1.price - 5000; 원래 의도
        b1.setPrice(-5000); // 실수
        System.out.println("판매 가격 : " + b1.getPrice() + "원");

        //고객 문의
        System.out.println("해상도 : " +  b1.resolution);

        System.out.println(" ----- ----- ----- ----- ");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("inavi2");
        // resolution 넣지 않기
        b2.color = "white";
        b2.setPrice(-5000); // 실수로 -5000 입력

        System.out.println("판매 가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
