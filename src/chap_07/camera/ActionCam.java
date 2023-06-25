package chap_07.camera;

public final class ActionCam extends Camera {
    // 생성자 생성 단축키 : alt + insert
    // 생성자는 객체가 만들어지는 시점에 호출
    // 그래서 생성자에 final 변수 초기화를 해도 된다.

    // 1. final 선언과 동시에 초기화
    // public final String lens = "광각렌즈";
    // 2. final 선언, 생성자에서 초기화

    // class 앞에 final을 붙이면 상속 불가
    public final String lens;

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    // 메소드에 final 사용 시, 자식 클래스에서 오버라이딩 불가
    public final void makeVideo() {
        // this.lens = "망원렌즈"; final로 인해 변경 불가
        System.out.println(this.name + " : "
                + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
