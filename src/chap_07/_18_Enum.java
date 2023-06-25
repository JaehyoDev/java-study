package chap_07;

import java.sql.SQLOutput;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum) : 상수들의 묶음
        // 달력 : JAN, FEB, MAR, ...
        // 옷 사이즈 : S, M, L, XL, ...
        // OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
        // 해상도: HD, FHD, QHD, UHD, ...
        // 상수값을 받아서 switch로 처리
        // 상수값들이 각각 의미하는 진짜 상수값을 이용하여 처리
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD: //
                System.out.println("고화질");
                break;
            case QHD:
                System.out.println("초고화질");
                break;
            case UHD:
                System.out.println("초초고화질");
                break;
        }

        // 문자열을 받아 열거형으로 변환
        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println(" ----- ----- ----- ----- ");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println(" ----- ----- ----- ----- ");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth() + " X "+ myRes.getHeight());
        }
    }
}

enum Resolution {
    HD(1280,920), FHD(1920,1080), QHD(2560,1440), UHD(3840,2160);

    private final int width;
    private final int height;
    Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
