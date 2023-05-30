package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        // 타입 앞에 final을 붙여서 사용하면 상수가 되어 변하지 않는 값이 된다.
        final String KR_COUNTRY_CODE = "+82"; // 국가 번호
        final double PI = 3.141592; // 원주율
        final String DATE_OF_BIRTH = "2001-12-31"; // 생년월일

        System.out.println(KR_COUNTRY_CODE);
        System.out.println(PI);
        System.out.println(DATE_OF_BIRTH);
    }
}
