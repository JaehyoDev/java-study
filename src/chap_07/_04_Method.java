package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "inavi";

        b1.autoReport(); // 지원 안 된 상태
        BlackBox.canAutoReport = true; // 개발된 상태
        b1.autoReport(); // 지원되는 제품으로 자동으로 보고

        b1.insertMemoryCard(256);

        // 일반 영상 : 1 (type)
        // 이벤트 영상 (충돌 감지) : 2 (type)
        
        int normalFileCount = b1.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수 : " + normalFileCount + "개");
        
        int eventFileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 : " + eventFileCount + "개");
    }
}
