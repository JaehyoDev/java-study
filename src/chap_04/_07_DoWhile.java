package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        // 수영장에서 수영하기
        System.out.println(" -----while 문 사용----- ");
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동거리 0m
        int height = 25; // 키 25m
        while (move + height < distance) { // 현재 이동거리가 전체 거리보다 작다면
            move += 3;
            if (move >= 25) {
                move = 25;
            }
            System.out.println("발차기를 계속 합니다. 현재 이동거리 : " + move);
        }
        System.out.println("도착하였습니다.");

        move = 0;

        System.out.println(" -----do while 문 사용----- ");
        do {
            move += 3;
            System.out.println("발차기를 계속 합니다. 현재 이동거리 : " + move);;
        } while (move + height < distance);
        System.out.println("도착하였습니다.");
    }
}
