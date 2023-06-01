package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        // Getter & Setter
        // 값을 가져오거나 설정할 때 발생할 수 있는 문제를 줄일 수 있다.
        // b2.setPrice(금액)으로 금액을 설정하면 b2.price = 금액 을 사용할 때보다 오류를 줄일 수 잇다.

        // BlackBox 클래스의 생성자를 주석 처리
        BlackBox b1 = new BlackBox();
        b1.modelName =  "inavi";
        b1.color = "black";
        b1.price = 200000;

        // 할인 행사
        // b1.price = b1.price - 5000; 원래 의도
        b1.price = -5000; // 실수
        System.out.println(b1.price);

        //고객 문의
        System.out.println("해상도 : " +  b1.resolution);

        System.out.println(" ----- ----- ----- ----- ");

        BlackBox b2 = new BlackBox();
        b2.setModelName("inavi2");
        // resolution 넣지 않기
        b2.color = "white";
        b2.setPrice(-5000); // 실수로 -5000 입력

        System.out.println("판매 가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
