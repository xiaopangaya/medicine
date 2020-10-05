package classTwo.com;

public class Eployee {
//    this();      //构造方法自己的调用必须放在第一行
    public int age;
    public String name;

    /**
     * 方法的重载为了解决方法名的问题，在同一个类中
     * 方法名相同，参数列表不同，与返回值无关
     */
    public Eployee(){

    }
    public Eployee(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void daka(){
        System.out.println("打卡1");

    }

    @Override
    public String toString() {
        System.out.println("工人名字");
        return "asd";
    }
}
