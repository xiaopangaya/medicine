package classTwo.com;

public class Doctor extends Character{
    public String workPlace;

    @Override
    public void work() {
        super.work();
        System.out.println("专业是救人");
    }

    public void learn(){
        System.out.println("学无止境");
    }
}
