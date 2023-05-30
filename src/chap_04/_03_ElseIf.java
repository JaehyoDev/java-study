package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 체리콕이 있으면 +1
        // 또는 버블티가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean cherryCoke = true; // 체리콕
        boolean bubbleTea = true; // 버블티

        if (cherryCoke) {
            System.out.println("체리콕 +1");
        } else if (bubbleTea) {
            System.out.println("버븥티 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if 는 여러번 사용 가능
        cherryCoke = false; // 체리콕
        bubbleTea = false; // 버블티
        boolean orangeJuice = true; // 오렌지주스

        if (cherryCoke) {
            System.out.println("체리콕 +1");
        } else if (bubbleTea) {
            System.out.println("버븥티 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // else 는 없어도 가능
        cherryCoke = false; // 체리콕
        bubbleTea = false; // 버블티
        orangeJuice = false; // 오렌지주스

        if (cherryCoke) {
            System.out.println("체리콕 +1");
        } else if (bubbleTea) {
            System.out.println("버븥티 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지주스 +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
