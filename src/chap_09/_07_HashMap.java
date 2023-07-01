package chap_09;

import java.sql.SQLOutput;
import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("김태리", 10); // 1번 손님에게 포인트 10 적립
        map.put("고수", 5); // 2번 손님에게 포인트 5 적립
        map.put("공유", 1); // 3번 손님에게 포인트 1 적립

        System.out.println("총 고객 수 : " + map.size());

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 조회
        System.out.println("김태리님의 포인트 : " + map.get("김태리"));
        System.out.println("고수님의 포인트 : " + map.get("고수"));
        System.out.println("공유님의 포인트 : " + map.get("공유"));

        System.out.println(" ----- ----- ----- ----- ");
        
        // 데이터 확인
        if (map.containsKey("공유")) {
            int point = map.get("공유");
            map.put("공유", ++point);
            System.out.println("공유님의 누적 포인트 : " + map.get("공유"));
        } else {
            map.put("공유", 1);
            System.out.println("공유님 신규 등록, 포인트 : " + map.get("공유"));
        }

        if (map.containsKey("김고은")) {
            int point = map.get("김고은");
            map.put("김고은", ++point);
            System.out.println("김고은님의 누적 포인트 : " + map.get("김고은"));
        } else {
            map.put("김고은", 1);
            System.out.println("김고은님 신규 등록, 포인트 : " + map.get("김고은"));
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 삭제
        map.remove("공유");
        System.out.println(map.get("공유")); // 키가 없으면 null

        System.out.println(" ----- ----- ----- ----- ");

        // 맵 비우기
        map.clear();
        System.out.println("맵 비우기");
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 추가
        map.put("김태리", 10); // 1번 손님에게 포인트 10 적립
        map.put("고수", 5); // 2번 손님에게 포인트 5 적립
        map.put("공유", 1); // 3번 손님에게 포인트 1 적립
        System.out.println("맵에 데이터를 다시 추가합니다.");

        System.out.println(" ----- ----- ----- ----- ");

        // 데이터 조회
        System.out.println("김태리님의 포인트 : " + map.get("김태리"));
        System.out.println("고수님의 포인트 : " + map.get("고수"));
        System.out.println("공유님의 포인트 : " + map.get("공유"));

        System.out.println(" ----- ----- ----- ----- ");

        // Key 확인 : 중복 허용 불가, 순서 보장 불가
        System.out.println("KEY 목록");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // Value 확인
        System.out.println("VALUE 목록");
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // Key & Value 함께 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println(" ----- ----- ----- ----- ");

        // 맵 : 중복 X, 순서 X
        // 중복 허용되지 않고 최근에 업데이트된 값이 들어간다.
        map.put("김태리", 10);
        map.put("김태리", 30);
        map.put("김태리", 50);
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        // 순서 보장을 위해서는 LinkedHashMap 이용
    }
}
