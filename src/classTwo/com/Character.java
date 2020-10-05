package classTwo.com;

public class Character {
    private String name;
    private char sex;
    private int age;

    public Character(){
        System.out.println("生而为人");
    }
    public Character(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void work(){
        System.out.println("工作");
    }

    public void live(){
        System.out.println("活着");
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
