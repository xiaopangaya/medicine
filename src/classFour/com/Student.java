package classFour.com;

import java.util.HashSet;

public class Student  {
    private String name;
    private int age;
    private double score;

    public Student(){

    }
    public Student(String name,int age,double score){
        this.name=name;
        this.age=age;
        this.score=score;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
