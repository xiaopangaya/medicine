package classFour.com;

import java.util.*;

public class Text {
    public static List AddList(){
        List<Book> books=new ArrayList<Book>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入4本书数据");
        for (int i = 0; i < 4; i++) {
            System.out.println("输入编号");;
            int bid=scanner.nextInt();
            System.out.println("输入书名");;
            String bname=scanner.next();
            System.out.println("输入单价");;
            int bprice=scanner.nextInt();
            System.out.println("输入出版社");;
            String bpress=scanner.next();
            Book book=new Book(bid,bname,bprice,bpress);
            books.add(book);
        }
        System.out.println("结束");
        return books;
    }
    public static Map AddMap(){
        Map<Integer,Book> bookHashMap=new HashMap<Integer, Book>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入4本书数据");
        for (int i = 0; i < 4; i++) {
            System.out.println("输入编号");;
            int bid=scanner.nextInt();
            System.out.println("输入书名");;
            String bname=scanner.next();
            System.out.println("输入单价");;
            int bprice=scanner.nextInt();
            System.out.println("输入出版社");;
            String bpress=scanner.next();
            Book book=new Book(bid,bname,bprice,bpress);
            bookHashMap.put(bid,book);
        }
        return bookHashMap;
    }
    public static void PrintList(List<Book> list){
        System.out.println("List遍历输出为");
        for (Book book :
                list) {
            System.out.println(book + "\t");
        }
    }
    public static void PrintMap(Map<Integer,Book> map){
        Set<Map.Entry<Integer, Book>> set=map.entrySet();
        set.forEach((e)->System.out.println(e));
    }
    public static void main(String[] args) {
        PrintList(AddList());
        PrintMap(AddMap());
    }
}
