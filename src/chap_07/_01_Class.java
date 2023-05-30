package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 색상, 가격

        // 우리가 만든 첫 번째 제품
        String modelName = "inavi";
        String resolution = "FHD";
        String color = "black";
        int price = 200000;

        // 우리가 만든 두 번째 제품
        String modelName2 = "inavi2";
        String resolution2 = "UHD";
        String color2 = "white";
        int price2 = 300000;

        // 또 다른 제품을 개발한다면
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();
    }
}
