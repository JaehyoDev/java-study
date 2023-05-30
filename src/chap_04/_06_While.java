package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        // 수영장에서 수영하기
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동거리 0m
        while (move < distance) { // 현재 이동거리가 전체 거리보다 작다면
            move += 2;
            if (move >= 25) {
                move = 25;
            }
            System.out.println("발차기를 계속 합니다. 현재 이동거리 : " + move);
        }
        System.out.println("도착하였습니다.");
    }
}
