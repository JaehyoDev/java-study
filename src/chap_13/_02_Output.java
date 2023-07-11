package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // printf
        // System.out.format();
        // System.out.printf();

        System.out.println("---------- 정수 ----------");
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1, 2, 3
        System.out.printf("%d%n", 1234); // 1234
        // 숫자를 넣으면 공간 확보
        System.out.printf("%6d%n", 1234); // __1234 (6자리 공간 확보)
        // 0과 숫자를 넣으면 공간 확보 후, 남는 공간은 0
        System.out.printf("%06d%n", 1234); // 001234 (6자리 공간 확보 후, 빈 공간은 0)
        // 음수를 표시하려면 출력 부분에 '-' (공간 차지)
        System.out.printf("%6d%n", -1234); // _-1234
        // format에 있는 '+'는 양수 표시 (공간 차지)
        System.out.printf("%+6d%n", 1234); // _+1234
        // 숫자 3자리마다 ',' (공간 차지)
        System.out.printf("%,6d%n", 1234); // _1,234
        // 공간 10자리 확보 후, 숫자 3자리마다 ','
        System.out.printf("%,10d%n", 1000000); // _1,000,000
        // format에 있는 '-'는 왼쪽 정렬
        System.out.printf("%-6d%n", 1234); // 1234__ (6자리 공간 확보 후, 왼쪽 정렬)

        System.out.println();

        System.out.println("---------- 실수 ----------");
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f", Math.PI); // 3.14
        System.out.printf("%6.2f%n", Math.PI); // __3.14
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%06.2f%n", Math.PI); // 003.14
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14

        System.out.println();

        System.out.println("---------- 문자열 ----------");
        System.out.printf("%s%n", "Java"); // Java
        System.out.printf("%6s%n", "Java"); // __Java
        System.out.printf("%-6s%n", "Java"); // Java__
        System.out.printf("%6.2s%n", "Java"); // ____Ja
        System.out.printf("%-6.2s%n", "Java"); // Ja____

        System.out.println();

        System.out.println("---------- 응용 ----------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("숀 " + 90 + " " + 80 + " " + 85.0); // 숀 90 80 85.0
        System.out.println("진 " + 100 + " " + 100 + " " + 100.0); // 미셸 100 100 100.0
        System.out.println("존 " + 95 + " " + 100 + " " + 97.5); // 존 95 100 97.5
        System.out.println("------------------------");
        System.out.println("이름     영어  수학    평균");
        System.out.printf("%-6s %4d %4d %6.1f%n", "숀", 90, 80, 85.0); // 숀 90 80 85.0
        System.out.printf("%-6s %4d %4d %6.1f%n", "진", 100, 100, 100.0); // 숀 90 80 85.0
        System.out.printf("%-6s %4d %4d %6.1f%n", "존", 95, 100, 97.5); // 숀 90 80 85.0
    }
}
