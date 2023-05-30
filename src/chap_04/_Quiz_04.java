package chap_04;

// 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차 시 20000원
// 경차 5시간 주차 시 10000원
// 장애인 차량 10시간 주차 시 15000원

// 실행 결과 : 주차 요금은 xx원 입니다.

public class _Quiz_04 {
    public static void main(String[] args) {
        boolean isSmallCar = false;
        boolean withDisabledPerson = true;
        int hour = 5;
        int fee = 4000 * hour;

        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + " 원 입니다.");
    }
}
