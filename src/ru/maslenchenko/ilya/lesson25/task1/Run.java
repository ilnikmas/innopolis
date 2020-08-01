package ru.maslenchenko.ilya.lesson25.task1;

import java.security.PublicKey;
import java.util.*;

public class Run {
    public static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(1, "Андрей");
        map.put(2, "Глеб");
        map.put(3, "Кирилл");
        map.put(4, "Феоктист");
        map.put(5, "Аксинья");
        map.put(6, "Никанор");
        map.put(7, "Сирануш");
        map.put(8, "Агриппина");
        map.put(9, "Агриппина");

        Run run = new Run();
        run.isUnique(map);
    }

    public boolean isUnique(Map<Integer, String> map) {
        List<String> list = new ArrayList<>(map.values());
        int hashMapIterator = 0;
        String val = null;
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            int arrayListIterator = 0;
            hashMapIterator++;
            Map.Entry mEntry = (Map.Entry) iter.next();
            val = mEntry.getValue().toString();
            for (String lst: list) {
                arrayListIterator++;
                if (val.equals(lst) && hashMapIterator != arrayListIterator) {
                    System.out.println("Дубли присутствуют");
                    return true;
                }
            }
        }
        System.out.println("Дубли отсутствуют");
        return false;
    }
}
