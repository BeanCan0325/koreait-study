package day1_29;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("A", 10);
        hs.put("B", 20);
        hs.put("C", 30);

        for (String key : hs.keySet()) {
            System.out.println("이름: " + key + ", 전화번호: " + hs.get(key));
        }

    }
}
