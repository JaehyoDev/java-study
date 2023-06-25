package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    // FactoryCam 자식 클래스에서 추상 메소드 showMainFeature()를 구현
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
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

    // 인터페이스 구현 전
//    public void detect() {
//        System.out.println("화재를 감지합니다.");
//    }
//
//    public void report() {
//        System.out.println("화재 신고를 진행합니다.");
//    }
}
