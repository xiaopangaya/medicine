package classFour.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,5,7,4,1,3,6,9,8,0,0,0,0);
        Stream<Integer> stream=list.stream();

//        Optional optional= stream.max((o1, o2)->o1-o2);     //找到最大值
//        System.out.println(optional.get());

//        long count= stream.filter(e->e==0).count();      //统计数量
//        System.out.println(count);

//        stream.distinct().forEach(e ->System.out.print(e+"\t"));      //去除重复
//        System.out.println();

        List list1=new ArrayList();
        stream.distinct().forEach(e->list1.add(e));    //去除重复
        list1.forEach(e->System.out.print(e+"\t"));
        System.out.println();
        System.out.print(list1);
    }


}
