import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
    public static void main(String[] args) {
        getString(JOptionPane.showInputDialog(null, "Введите значение:"),
        Integer.valueOf(JOptionPane.showInputDialog(null, "Введите значение:")));
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