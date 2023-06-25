package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스가 부모 클래스의 메소드를 덮어쓰기 (재정의)
        // 부모 클래스에 있는 똑같은 메소드 이름으로 자식 클래스에 재정의
        // Camera에 있는 showMainFeature 메소드를 FactoryCam, SpeedCam에서 재정의
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }

}
