package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "inavi"; // inavi(최신형) 인스턴스 변수의 값을 바꿔보자.
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
    }
}
