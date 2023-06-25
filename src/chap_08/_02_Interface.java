package chap_08;

// import chap_08.reporter.NormalReporter;
// import chap_08.reporter.Reportable;
// import chap_08.reporter.VideoReporter;
// import chap_08.detector.AdvancedFireDetector;
// import chap_08.detector.Detectable;
// import chap_08.detector.FireDetector;
import chap_08.camera.FactoryCam;
import chap_08.reporter.*;
import chap_08.detector.*;
public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 (Interface) : 뼈대만 제공하는 구조
        // 클래스는 단일상속만 가능하지만 인터페이스를 이용하면 여러가지 기능을 이용 가능
        // 공장 카메라가 화재를 감지하면 자동 신고하도록 기능 추가
        // 과속단속 카메라가 사고를 감지하면 자동 신고하도록 기능 추가
        // detector, reporter 패키지 추가
        // Detectable, Reportable 인터페이스 추가
        // FireDetector, AdvancedFireDetector, NormalReporter, VideoReporter 클래스 추가

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println(" ----- ----- ----- ----- ");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);
        factoryCam.detect();
        factoryCam.report();
    }
}
