package chap_09.coffee;

public class CoffeeByNumber {
    // 주문번호에 의해 커피 수령
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }
}
