package classFour.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void list1(){
        //用来排序
        List<Integer> list=new ArrayList<Integer>();

        list.add(2);
        list.add(-2);
        list.add(4);
        list.add(3);

//        list.forEach(e->System.out.print(e+"\t"));
        System.out.println();
        Collections.sort(list);
//        Collections.sort(list,(a,b)->(a-b)*-1);
        list.forEach(e->System.out.print(e+"\t"));
        System.out.println();
//       int n=Collections.binarySearch(list,3);
//       System.out.println(n);
//       List list1=new ArrayList();
//       Collections.copy(list1,list);
//       list1.forEach(o -> System.out.println(o+"\t"));


//        List list1=Collections.unmodifiableList(list);   //两个都会变成不可修改的集合
//        Collections.synchronizedList(list);         //线程访问安全设置


//        Collections.reverse(list);              //反转
//        list.forEach(e->System.out.print(e+"\t"));

        int min=Collections.min(list);
        System.out.println(min);
        int max=Collections.max(list);
        System.out.println(max);

    }

    public static void main(String[] args) {
        list1();
    }
}
