package chap_07.camera;

// SpeedCam is a Camera. (IS-A)
public class SpeedCam extends Camera { // 자식 클래스

    public SpeedCam() {
        // this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

//    // super를 사용하지 않는 경우
//    public void takePicture() {
//        // 사진 촬용
//        System.out.println(this.name + ": 사진을 촬영합니다.");
//        checkSpeed();
//        recognizeLicensePlate();
//    }

    // super를 사용하는 경우
    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        // 속도 측정
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 차량 번호판 인식
        System.out.println("차량 번호판을 인식합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호판 인식");
    }
}
