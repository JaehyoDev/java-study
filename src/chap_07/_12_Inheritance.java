package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        SpeedCam speedCam = new SpeedCam();
        FactoryCam factoryCam = new FactoryCam();

        System.out.println(camera.name);
        System.out.println(speedCam.name);
        System.out.println(factoryCam.name);

        camera.takePicture();
        speedCam.takePicture();
        factoryCam.recordVideo();

        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
        factoryCam.detectFire();
    }
}
