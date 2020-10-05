package classFour.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetText {
    public static Set SetAdd(){
        Set set=new HashSet<>();

        for (int i =0; i < 4; i++) {
            System.out.println("名字");
            Scanner scanner=new Scanner(System.in);
            String namme=scanner.next();
            set.add(namme);
        }
        return set;
    }

    public static void getSet(Set set){
        for (Object o :
                set) {
            System.out.print(o+"\t");
        }
    }
    public static void getSet1(Set set){
        set.forEach(a->System.out.println(a+"\t"));
    }
    public static void main(String[] args) {
        getSet1(SetAdd());
    }
}
