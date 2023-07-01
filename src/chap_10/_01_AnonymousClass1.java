package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        Coffee c2 = new Coffee();
        c2.order("라떼");

        System.out.println("--------------------");

        // 익명 클래스 예시 : 굉장히 친한 친구 방문
        // 익명 함수를 사용하여 클래스 정의와 동시에 객체를 생성. 일회성으로 사용
        // 일반적으로 한번만 생성되고 재생성되지 않는 객체를 만들 때 익명 함수 사용
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스에요.");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울게요.");
            }
        }; // 익명 클래스는 끝에 세미콜론을 붙이기

        // 익명 클래스 객체 사용
        specialCoffee.order("바닐라라떼");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + "나왔습니다.");
    }
    public void returnTray() {
        System.out.println("컵, 쟁반 반납이 완료되었습니다.");
    }
}