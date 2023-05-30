package chap_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "Jerry";
        int age = 32;

        System.out.println(name + "님은 남자이고 나이는 " + age + " 살이다.");
        System.out.println(name + "님은 성인이다.");

        name = "Tom";
        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격하였나요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;

        System.out.println(d);
        System.out.println(f);


        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
