package chap_10.converter;

@FunctionalInterface // 함수형 인터페이스, 이걸 써놓으면 메소드를 2개 이상 쓸 때 오류가 나오므로 실수를 알 수 있음.
public interface Convertible {
    void convert(int USD);
}
