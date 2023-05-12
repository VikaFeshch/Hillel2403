package org.example.Lesson11;

import java.util.HashMap;
import java.util.Map;

public class lesson11 {
    public static void main(String[] args) {
        Map<String, String> info = new HashMap<>();
        info.put("name", "Bill");
        info.put("phone", "222-33-44");
        info.put("address", "Kyiv");
     /*   System.out.println(info);
      //  info.clear();
        System.out.println(info.put("name", "Vasiliy"));
        System.out.println(info.put("names", "Fver"));

        System.out.println(info);
        System.out.println(info.isEmpty());
        System.out.println(info.size());
        System.out.println(info.containsKey("name"));
        System.out.println(info.containsValue("Kyiv"));
        System.out.println(info.get("name").toUpperCase());
        System.out.println(info.remove("names"));
        System.out.println(info.keySet());
        System.out.println(info.values());*/
        for (Map.Entry<String,String> l:info.entrySet()){
            System.out.println(l);
            System.out.println(l.getValue().toUpperCase());
            l.setValue("klop");
        }
        System.out.println(info);
    }
}
