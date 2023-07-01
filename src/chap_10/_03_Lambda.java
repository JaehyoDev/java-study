package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // (전달값1, 전달값2, ...) -> { 코드 }
    }

// 일반 메소드
//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

// 람다식 메소드
//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

// 일반 메소드 전달값 1개
//    public void print(String s) {
//        System.out.println(s);
//    }

// 람다식 메소드 전달값 1개
//    s -> System.out.println(s)

// 일반 메소드 전달값 2개, 반환값 1개
//    public int add(int x, int y) {
//        return x + y;
//    }

// 람다식 메소드 전달값 2개, 반환값 1개
//    (x, y) -> { return x + y; } // 또는
//    (x, y) -> x + y
}
