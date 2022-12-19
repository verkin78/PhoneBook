import javax.swing.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
    public static void main(String[] args) {
        getString(JOptionPane.showInputDialog(null, "Введите значение:"),
                Integer.valueOf(JOptionPane.showInputDialog(null, "Введите значение:")));
    }

    public static void generateCollection() {
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("string1", List.of(12, 15, 786));
        listMap.put("string2", List.of(45, 141, 42));
        listMap.put("string3", List.of(12, 5, 42));
        listMap.put("string4", List.of(1000, 124, 43));
        listMap.put("string5", List.of(23, 173, 452));


        Map<String, List<Integer>> listMap1 = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            Integer sum = 0;
            sum = entry.getValue().stream().mapToInt(Integer::intValue).sum();
            listMap1.put(entry.getKey(), Collections.singletonList(sum));
        }
        System.out.println(listMap1);

    }

    public static void getString(String s, Integer i) {

        Map<String, Integer> maps = new HashMap<>();
        maps.put("Строка1", 2);
        for (Map.Entry<String, Integer> s1 : maps.entrySet()) {
            if (!s.equals(s1.getKey()) && i != s1.getValue()) {
                maps.put(s, i);
                JOptionPane.showMessageDialog(null, maps);
            }
            if (s.equals(s1.getKey()) && i == s1.getValue()) {
                JOptionPane.showMessageDialog(null, "Такая строка уже есть!!!");
                throw new UnsupportedOperationException("Такая строка уже есть!!!");
            }
            if (s.equals(s1.getKey()) && i != s1.getValue()) {
                maps.remove(s);
                maps.put(s, i);
                JOptionPane.showMessageDialog(null, maps);
            }

        }
    }



}