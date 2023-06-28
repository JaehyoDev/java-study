package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 (Generics)  : 서로 다른 타입이 들어와도 처리할 수 있음
        // 불필요한 코드를 줄일 수 있음
        int[] iArray = {1, 2, 3, 4, 5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println(" ----- ----- ----- ----- ");

        Integer[] iArray2 = {1, 2, 3, 4, 5}; // Integer는 Wrapper 클래스
        Double[] dArray2 = {1.0, 2.0, 3.0, 4.0, 5.0}; // Double은 Wrapper 클래스
        // String은 Wrapper 클래스가 아니다.

        printAnyArray(iArray2); // 기본자료형은 제네릭스 사용 불가 그러므로 wrapper 클래스사용
        printAnyArray(dArray2); // 기본자료형은 제네릭스 사용 불가 그러므로 wrapper 클래스사용
        printAnyArray(sArray); // 객체자료형은 제네릭스 사용 가능
    }

    // 제네릭스
    // T : Type (앞과 뒤에 쌍만 맞춰주면 이름은 상관 없음)
    // K : Key, V : Value, E : Element
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
}
