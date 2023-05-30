package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        // For
        int max = 10; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int customers = 20; // 총 대기번호 20번
        int noShow = 6; // 대기번호 6번 손님이 노쇼

        for (int i = 1; i <= customers; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면?
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 다음 손님으로 넘어갑니다.");
                continue;
            }

            sold++;

            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                 break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("----- ----- ----- -----");

        // While 문
        sold = 0;
        int num = 0; // 손님 번호

        while (num <= customers) {
            num++;
            System.out.println(num + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면?
            if (num == noShow) {
                System.out.println(num + "번 손님, 노쇼로 다음 손님으로 넘어갑니다.");
                continue;
            }

            sold++;

            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
