package chap_07;

public class BlackBoxRefurbish {
    // 접근제어자 테스트를 위해 클래스를 만듬
    public String modelName; // 모델명
    String resolution; // 해상도
    protected String color; // 색상
    private int price; // 가격

    // 자동으로 Getter&Setter 작성하는 법은 Code -> Generate -> Getter and Setter
    public String getModelName() {
        return modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }
}
