package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나르코스 매장
        System.out.println("어서오세요. 나르코스입니다.");
        // 또 다른 손님이 온다면?
        System.out.println("어서오세요. 나르코스입니다.");
        System.out.println("어서오세요. 나르코스입니다.");
        System.out.println("어서오세요. 나르코스입니다.");
        // 만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 나르코스입니다.");
        // 매장 이름이 바뀌면?
        System.out.println("환영합니다. 코스나르입니다.");

        // Tip : 'Alt + 드래그' 하면 여러 개를 동시에 수정 가능

        System.out.println(" ----- 반복문 사용 ----- ");

        // 반복문 사용 For
        int customers = 4; // 방문한 손님 수

        for (int i = 0; i < customers; i++) {
            System.out.println((i + 1) + "번째 손님, 반갑습니다. 코스나르입니다.");
        }

        // Tip : 'fori' 만 적고 엔터

        // 짝수만 출력
        // 02468
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        // 줄 바꿈
        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        // 줄 바꿈
        System.out.println();

        // 감소
        // 54321
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        // 줄 바꿈
        System.out.println();

        // 1부터 10까지의 수들의 합
        // 1 + 2 + 3... + 9 + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지의 총합 : " + sum);
        }
        System.out.println("1부터 10까지의 모든 수의 총합 : " + sum);
    }
}
