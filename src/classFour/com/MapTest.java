package classFour.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void AddMap(){
        Map<Integer,String> map=new HashMap<>();
        map.put(001,"zhangsan");
        map.put(002,null);
        map.put(null,"wangwu");
        map.put(004,"lisi");
        System.out.println(map);

//        Map map1=new HashMap();
//        map1.put("map",map);

        map.remove(001);
        System.out.println(map);

    };

    public static void print(Map map){
        Set s=map.keySet();
        s.forEach(e->System.out.print(e));

    }
    public static void print1(Map map){
        map.values().forEach(e->System.out.print(e+"\t"));
    }
    public static void print2(Map map){
        Set<Map.Entry> set=map.entrySet();
        set.forEach((e)->System.out.print(e));
    }
    public static void main(String[] args) {
        AddMap();
    }
}
