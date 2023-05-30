package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 명명법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백은 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상의 단어 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "Republic of Korea"; // 국적
        String firstName = "Jerry"; // 이름
        String lastName = "Kim"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "Hilton Hotel"; // 체류지
        String purposeOfVisit = "관광"; // 입국 목적
        String flightNo = "KE727"; // 항공 편명
        String _flightNo = "JP757"; // 밑줄 시작
        String flight_no_2 = "CN575"; // 밑줄과 숫자 포함

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
