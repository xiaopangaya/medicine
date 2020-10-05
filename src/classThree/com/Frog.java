package classThree.com;

public class Frog extends Animal implements Swim{
    public Frog(){

    }
    public Frog(String name,String color,String kind){
        super(name, color, kind);
    }
    @Override
    public void swimming() {
        System.out.println("我是青蛙我会游泳。");
    }
}
