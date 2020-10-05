package classTwo.com;

public class Thief extends Character{
    private String getAway;

    @Override
    public void live() {
        super.live();
        System.out.println("打工是不可能打工的");
    }

    public void play(){
        System.out.println("平时做得最多的是坐牢");
    }
}
