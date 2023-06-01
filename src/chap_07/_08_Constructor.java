package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "inavi";
        b1.resolution = "FHD";
        b1.color = "black";
        b1.price = 200000;
        System.out.println("b1의 모델명 : " + b1.modelName);
        System.out.println("b1의 시리얼 번호 : " + b1.serialNumber);

        // 생성자를 이용하면 인스턴스를 만들 때 인스턴스변수에 일일이 지정할 필요가 없다.
        // b2는 기본 생성자 호출은 하지 않고 사용자 정의 생성자만 출력하게 된다. (매개변수가 있기 때문에...)
        // 하지만 BlackBox 클래스에서 사용자 정의 생성자 안에서 this()를 통하여 기본 생성자도 출력하게 만들었다.
        BlackBox b2 = new BlackBox("inavi2", "UHD", "white", 300000);
        System.out.println("b2의 모델명 : " + b2.modelName);
        System.out.println("b2의 시리얼 번호 : " + b2.serialNumber);
    }
}
