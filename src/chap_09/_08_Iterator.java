package chap_09;

import java.sql.SQLOutput;
import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 (Alt + Enter 하면 임포트)
        // 컬렉션 프레임워크에서 값을 가져오거나 삭제할 때 사용
        // Iterator<데이터타입> iterator명 = collection명.iterator();
        List<String> list = new ArrayList<>();
        // List<String> list2 = new LinkedList<>();

        list.add("김고은");
        list.add("(알 수 없음)");
        list.add("이동욱");
        list.add("(알 수 없음)");
        list.add("공유");
        list.add("(알 수 없음)");
        list.add("유인나");
        list.add("(알 수 없음)");
        list.add("육성재");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(" ----- ----- ----- ----- ");

        // list.iterator() 작성 후 Ctrl + Alt + V 자동 완성
        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println(" ----- ----- ----- ----- ");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(" ----- ----- ----- ----- ");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove();
            //} else {
            //    System.out.println(it.next()); // 불가능
            }
        }

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(" ----- ----- ----- ----- ");

        HashSet<String> set = new HashSet<>();
        set.add("김고은");
        set.add("공유");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println(" ----- ----- ----- ----- ");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("김고은", 10);
        map.put("공유", 5);

        System.out.println(" ----- ----- ----- ----- ");

        // map.iterator(); // 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println(" ----- ----- ----- ----- ");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println(" ----- ----- ----- ----- ");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
