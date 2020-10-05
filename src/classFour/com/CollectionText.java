package classFour.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class CollectionText {
    public static List add(){
        List<String> list=new ArrayList<String>();
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("输入名字");;
            String name=scanner.next();
            list.add(i,name);
            System.out.println("输入性别");;
            String sex=scanner.next();
            list.add(i,sex);
        }


        System.out.println("结束");
        return list;
    }

    public static void print1(List list){
        for (int i = 0 ; i < list.size(); i++) {
            Object o =list.get(i);
            System.out.print(o+"\t");
        }
    }

    /**
     * 迭代器
     * @param list
     */
    public static void print2(List list){
        Iterator<Object> iterator=list.iterator();
        while (iterator.hasNext()){
            Object o=iterator.next();
            System.out.print(o+"\t");
        }
    }

    public static void print3(List list){
        Iterator<Object> iterator=list.iterator();
        Consumer<Object> consumer=new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                System.out.print(o+"\t");
            }
        };
        iterator.forEachRemaining(consumer);
    }


    public static void print4(List list){
        Iterator<Object> iterator=list.iterator();
        iterator.forEachRemaining(a->System.out.print(a+"\t"));
    }
    public static void print5(List list){
        for (Object o :
                list) {
            System.out.print(o + "\t");
        }
    }

    public static List StuAdd(){
        List<String> list=new ArrayList<String>();
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("输入"+(i+1)+"个学生姓名");;
            String name=scanner.next();
            list.add(i,name);
            System.out.println("输入"+(i+1)+"个学生年龄");;
            String sex=scanner.next();
            list.add(i,sex);
            System.out.println("输入"+(i+1)+"个学生成绩");;
            String score=scanner.next();
            list.add(i,score);
        }
        System.out.println("结束");
        return list;
    }
    public static void printStu(List list){
        for (int i = 0 ; i < list.size(); i++) {
            Object o =list.get(i);
            System.out.println("第"+(i+1)+"个学生"+o);
        }
    }
    public static void main(String[] args) {
//        List list=add();
//        list.remove(0);
//        list.remove("张三");
//        list.set(0,"lisi");
//        list.clear();
//        list.contains("zhangsan");//查找是否有。有true没有false
        printStu(StuAdd());
    }
}
