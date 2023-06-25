package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성 (Polymorphism)
        // 부모 클래스로 서로 다른 형태의 객체를 만든다.

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println(" ----- ----- ----- ----- ");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2]= new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        // SpeedCam speedCam = new SpeedCam();
        // 으로 생성된 객체도 cameras 배열로 관리할 수 있다.

        System.out.println(" ----- ----- ----- ----- ");

        // 부모 클래스로 정의를 하여 자식 클래스에 있는 메소드를 사용 불가
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam. recognizeLicensePlate();
        // 해결 방법 : 'instanceof'와 '형변환'

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // 모든 자바 클래스는 Object 클래스를 상속받고 있다.
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}
