package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        // finally는 try 구문에서 무조건 실행된다.
        // 정상 : try -> finally
        // 예외 : try -> catch -> finally
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
        } catch (Exception e) {
            System.out.println("! 문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }
        
        // try + catch(s)
        // try + catch(s) + finally
        // try + finally

        System.out.println("--------------------");
        
        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
