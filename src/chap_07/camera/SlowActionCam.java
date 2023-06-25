package chap_07.camera;

public class SlowActionCam {
    public String name;
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라"; // Camera의 name 이용
    }

    // ActionCam 클래스에서 makeVideo 메소드는 final이라서 오버라이딩 불가
//    public void makeVideo() {
//        // this.lens = "망원렌즈"; final로 인해 변경 불가
//        System.out.println(this.name + " : "
//                + this.lens + "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 제작합니다.");
//    }

    public void makeVideo() {
        System.out.println(this.name + " : 자체 개발한 슬로우모드 비디오를 제작합니다.");
    }
}
