package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        // 중복 허용 불가 , 순서 보장 불가
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료수");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        // 데이터 개수 : 중복된 것은 제외
        System.out.println("총 구매해야할 상품 수 : " + set.size());

        System.out.println(" ----- ----- ----- ----- ");
        
        // 데이터 순회
        System.out.println("-구매해야할 상품 목록-");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 삭제
        System.out.println("총 구매해야할 상품 수 (삼겹살 구매 전) : " + set.size());
        System.out.println("삼겹살 구매 (데이터 삭제)");
        set.remove("삼겹살");
        System.out.println("총 구매해야할 상품 수 (삼겹살 구매 후) : " + set.size());

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 포함 확인
        System.out.println("삼겹살 구매 (데이터 포함) 여부 : " + set.contains("삼겹살"));

        System.out.println(" ----- ----- ----- ----- ");

        // 세트 비우기
        set.clear();
        System.out.println("전체 구매 완료 (전체 데이터 삭제)");
        System.out.println("세트 빈 상태 : " + set.isEmpty());

        System.out.println(" ----- ----- ----- ----- ");

        // 중복 허용 불가, 순서 보장 불가
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(123);
        intSet.add(2);
        intSet.add(1);

        for (int i : intSet) {
            System.out.println(i);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 순서 보장이 필요하다면 -> LinkedHashSet 이용
        // 하지만 중복 허용 불가
        HashSet<Integer> intSet2 = new LinkedHashSet<>();
        intSet2.add(1);
        intSet2.add(123);
        intSet2.add(2);
        intSet2.add(1);

        for (int j : intSet2) {
            System.out.println(j);
        }
    }
}
