package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "inavi"; // public
        // b1.resolution = "FHD" // default 다른 패키지라서 접근 불가능
        // b1.color = "black"; // protected 같은 패키지도 아니고, 다른 클래스인 경우인데 자식 클래스가 아니라 접근 불가능
        // b1.price = 200000; // private 다른 클래스라서 접근 불가능
    }
}
