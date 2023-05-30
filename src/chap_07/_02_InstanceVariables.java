package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        // 처음 만든 블랙박스 제품
        BlackBox b1 = new BlackBox();
        b1.modelName = "inavi";
        b1.resolution = "FHD";
        b1.color = "black";
        b1.price = 200000;

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.color);
        System.out.println(b1.price);

        System.out.println(" ----- ----- ----- ----- ");

        // 새로 만든 블랙박스 제품
        BlackBox b2 = new BlackBox();
        b2.modelName = "inavi2";
        b2.resolution = "UHD";
        b2.color = "white";
        b2.price = 300000;

        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.color);
        System.out.println(b2.price);
    }
}
