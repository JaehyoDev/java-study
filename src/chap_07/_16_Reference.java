package chap_07;

import chap_07.camera.Camera;

import java.sql.SQLOutput;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조

        // 기본 자료형 (Primitive Data Types)
        // int, float, double, long, boolean ...

        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types)
        // String, Camera, FactoryCam, SpeedCam ...

        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        // 기본 자료형 예시
        System.out.println(" ----- ----- ----- ----- ");

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        // 참조 자료형 예시
        // 1번 객체에 2번 객체를 할당하면
        // 1번 객체는 2번 객체를 참조한다.
        System.out.println(" ----- ----- ----- ----- ");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = c1; // c1이 참조한내용을 c2가 참조
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난 카메라"; // c2.name을 바꾼 것은 실제로는 c1.name을 바꾼 것
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeName(c2); // c2.name을 바꾼 것은 실제로는 c1.name을 바꾼 것
        System.out.println(c1.name);
        System.out.println(c2.name);

        // 참조 관계를 끊으려면 null 또는 생성자를 사용
        // c2 = null;
        c2   = new Camera();
        c2.name = "수리된 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
