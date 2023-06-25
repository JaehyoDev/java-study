package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능한 껍데기만 있는 메소드)
        // 그럼 추상 클래스를 왜 사용하는 가? 유지보수, 중복된 코드 줄이기, 코드의 재사용성 등

        // Camera camera = new Camera(); 추상 클래스라 객체로 만들 수 없다.
        // 추상 클래스를 상속받는 자식은 객체로 만들 수 있다.
        // Camera 클래스를 상속받은 자식은
        // Camera factoryCam = new FactoryCam(); 가능
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
