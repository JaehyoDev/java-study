package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final : 값을 사용할 수 있지만 변경 불가 (클래스 상속 불가, 변수 변경 불가, 메소드 오버라이딩 불가)
        // 변수 선언만 하면 오류가 나온다. 변수 선언하고 변수 초기화도 해줘야한다.
        // Final 위치
        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ...

        // ActionCam 클래스 생성
        // 렌즈 변수를 바꿀 수 없도록 하려면?
        // ActionCam 클래스에서 lens 변수에 final 추가

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈"; final로 인해 변경 불가
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println(" ----- ----- ----- ----- ");

        // SlowActionCam에서 makeVideo 메소드 오버라이딩을 사용 못 하게 하려면
        // 부모인 ActionCam에서 makeVideo 메소드에 final 추가
        SlowActionCam slowActionCam = new SlowActionCam();
        // slowActionCam.recordVideo(); ActionCam이 final이라 상속 불가로 사용 불가
        slowActionCam.makeVideo();
    }
}
