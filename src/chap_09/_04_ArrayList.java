package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        // 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
        // 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("강아지");
        list.add("고양이");
        list.add("코끼리");
        list.add("하마");
        list.add("낙타");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 삭제
        System.out.println("리스트 안 데이터 수 : " + list.size());
        list.remove("하마");
        System.out.println("하마 데이터를 삭제하였습니다.");
        System.out.println("리스트 안 데이터 수 : " + list.size());
        System.out.println("원래 하마 데이터 자리에는 " + list.get(3));

        System.out.println(" ----- ----- ----- ----- ");

        System.out.println("리스트 안 데이터 수 : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("마지막 데이터를 삭제하였습니다.");
        System.out.println("리스트 안 데이터 수 : " + list.size());

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 변경
        System.out.println("데이터 변경 전 0번 인덱스 : " + list.get(0));
        list.set(0, "늑대");
        System.out.println("데이터 변경 전 0번 인덱스 : " + list.get(0));

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 인덱스 확인
        System.out.println("늑대의 인덱스 : " + list.indexOf("늑대"));

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 포함 여부
        System.out.println("늑대 포함 여부 : " + list.contains("늑대"));

        System.out.println(" ----- ----- ----- ----- ");

        // 리스트 비우기
        list.clear();
        System.out.println("리스트 빈 상태 : " + list.isEmpty());
        // System.out.println(list.get(0)); // 에러

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 추가
        System.out.println("리스트에 데이터를 추가합니다.");
        list.add("강아지");
        list.add("고양이");
        list.add("코끼리");
        list.add("하마");
        list.add("낙타");

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 정렬
        System.out.println("데이터 정렬 전");
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println(" ----- ----- ----- ----- ");
        System.out.println("데이터 정렬 후");
        Collections.sort(list);
        for (String s: list) {
            System.out.println(s);
        }
    }

}
