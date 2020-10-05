package classTwo.com;

public class Patient {

    String name;
    char sex;
    Integer age;
    float weight;
    boolean allergies;

    public Patient(){

    }
    public Patient(String name,char sex,Integer age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    /**
     * 代码块，在创建对象过程中执行
     * 共有的东西时使用
     * 先执行代码块再其他的
     */
    {

    }
    public void kanyisheng(){
        System.out.println("看医生");
    }
    public void quyao(){
        System.out.println("取药");
    }
    public void fufei(){
        System.out.println("付费");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", weight=" + weight +
                ", allergies=" + allergies +
                '}';
    }


    public Child newChild(){
        return new Child();
    }
    /**
     * 内部类 可以被任何修饰符修饰
     * 可以看作一个属性
     * 一般私有
     */
    private class Child{
        String sex;
        Integer age;
    }

//    public void watch(doctor a){
//    }
}
