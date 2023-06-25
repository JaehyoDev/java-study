package chap_07.camera;

// FactoryCam is a Camera. (IS-A)
public class FactoryCam extends Camera { // 자식 클래스

    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장 카메라");
    }

//    super를 사용하지 않는 경우
//    public void recordVideo() {
//        // 동영상 촬영
//        System.out.println(this.name + ": 동영상을 녹화합니다.");
//        detectFire();
//    }

    // super를 사용하는 경우
    public void recordVideo() {
        // 동영상 촬영
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    // showMain 입력하면서 자동완성을 하면 @Override 주석이 뜸
    // 메소드명을 직접 입력하면 @Override 주석은 뜨지 않음
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
