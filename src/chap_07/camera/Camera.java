package chap_07.camera;

public class Camera { // 부모 클래스
    public String name; // 인스턴스 변수
    // name 변수를 접근제어자 private으로 쓰면 FactoryCam, SpeedCam 등에서 사용 불가

    public Camera() {
        this("카메라");
    }

    protected Camera(String name) {
        this.name = name;
    }

    public void takePicture() {
        // 사진 촬용
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 촬영
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }
}
