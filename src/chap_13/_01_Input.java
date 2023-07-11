package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요.");
//        String name = sc.next();
//        System.out.println("나이를 입력하세요.");
//        // int age = Integer.parseInt(sc.next());
//        int age = sc.nextInt();
//        System.out.println("키를 입력하세요.");
//        // double height = Double.parseDouble(sc.next());
//        double height = sc.nextDouble();
//        System.out.println("혈액형을 입력하세요.");
//        String bloodType = sc.next();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("나이 : " + age);
//        System.out.println("키 : " + height);
//        System.out.println("혈액형 : " + bloodType);

        // sc.next()는 한 단어씩만 입력이 가능하다.
        // 두 단어 이상 입력시 다음 단어는 다음 sc.next()로 입력된다.
        // sc.nextLine()은 한 문장씩 입력이 가능하다.

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next(); // 한 단어 (자바, 파이썬)
        // String lang = sc.nextLine();
        System.out.println("배운 언어 : " + lang);

        sc.nextLine(); // 불필요한 문장을 삭제

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);

        // 문장 입력 받기
        // 1. sc.next()로 입력 받으면 첫 단어만 입력되고
        // 뒷 단어들은 다음 sc.next()로 들어가므로
        // sc.nextLine()을 sc.next() 바로 다음에 쓰면 뒷 단어들은 삭제된다.
        // 2. sc.nextLine()으로 입력 받기
    }
}
