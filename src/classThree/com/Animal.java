package classThree.com;

public class Animal {
    private String name;
    private String color;
    private String kind;
    public Animal(){

    }
    public Animal(String name,String color,String kind){
        this.name=name;
        this.color=color;
        this.kind=kind;
    }
    public void Eat(){
        System.out.println("这个动物会吃饭。");
    }
    public void Speak(){
        System.out.println("这个动物会发出声音");
    }
}
