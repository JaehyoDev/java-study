package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        // 부모 클래스에 있는 것을 자식 클래스에서 사용
        // 부모 클래스에 있는 메소드를 똑같이 자식 클래스에 작성하고
        // 부모 클래스에 있는 메소드 내용은 super.메소드명();으로 대신 작성 가능
        // 자식 클래스에서 사용할 메소드 내용을 추가로 작성할 수 있음
        // super를 사용하지 않으면 상속의 의미가 없이 그대로 메소드를 또 작성하는 것과 같음
        // 1. 부모 클래스 변수 호출 : super.변수명
        // 2. 부모 클래스 메소드 호출 : super.메소드명()
        // 3. 부모 클래스 생성자 호출 : super()는 부모 클래스의 생성자에 접근
        // 부모 클래스 생성자 this(이름)를 호출하여 이름을 자식 클래스에서 변경

        // 공장 카메라는 동영상 녹화 -> 화재 감지
        // 과속 카메라는 사진 촬영 -> 속도 측정, 번호판 인식

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println(" ----- ----- ----- ----- ");
        speedCam.takePicture();
    }
}
