package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 중복 데이터 허용
        LinkedList<String> list = new LinkedList<>();

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

        System.out.println(list.getFirst()); // ArrayList ㅂ루가
        System.out.println(list.getLast()); // ArrayList 불가

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 추가 (앞)
        list.addFirst("사자");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 추가 (뒤)
        list.addLast("호랑이");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 추가 (중간)
        list.add(1, "나무늘보");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 삭제
        System.out.println("리스트 안 데이터 수 : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("마지막 데이터를 삭제하였습니다.");
        System.out.println("리스트 안 데이터 수 : " + list.size());
        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 삭제 (앞과 뒤)
        System.out.println("처음과 마지막 데이터 삭제 전");
        for (String s: list) {
            System.out.println(s);
        }
        list.removeFirst();
        list.removeLast();
        System.out.println(" ----- ----- ----- ----- ");
        System.out.println("처음과 마지막 데이터 삭제 후");
        for (String s: list) {
            System.out.println(s);
        }
        
        System.out.println(" ----- ----- ----- ----- ");
        
        // 데이터 변경
        System.out.println("데이터 변경 전 0번 인덱스 : " + list.get(0));
        list.set(0, "올빼미");
        System.out.println("데이터 변경 후 0번 인덱스 : " + list.get(0));

        System.out.println(" ----- ----- ----- ----- ");
        
        // 데이터 인덱스 확인
        System.out.println("올빼미의 인덱스 : " + list.indexOf("올빼미"));

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 포함 확인
        System.out.println("나무늘보 포함 여부 : " + list.contains("나무늘보"));

        System.out.println(" ----- ----- ----- ----- ");

        // 리스트 비우기
        list.clear();
        System.out.println("리스트 빈 상태 : " + list.isEmpty());

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 추가
        System.out.println("리스트에 데이터를 추가합니다.");
        list.add("강아지");
        list.add("고양이");
        list.add("코끼리");
        list.add("하마");
        list.add("낙타");
        for (String s : list) {
            System.out.println(s);
        }

        // 데이터 정렬
        System.out.println(" ----- ----- ----- ----- ");
        System.out.println("리스트를 정렬합니다.");
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
