package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회를 이용한 커피 주문
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println(" ----- ----- ----- ----- ");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println(" ----- ----- ----- ----- ");

        // enhanced for (for-each) 반복문
        // Tip
        // 1. 'foreach' 입력
        // 2. '자료형 인자변수명' 입력 후 탭
        // 3. '배열변수명' 입력 후 탭
        // 4. 실행할 코드 입력
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
    }
}
