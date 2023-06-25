package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    // SpeedCam 자식 클래스에서 추상 메소드 showMainFeature()를 구현
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호판 인식");
    }

    private Detectable detector; // 인터페이스 변수
    private Reportable reporter; // 인터페이스 변수

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
