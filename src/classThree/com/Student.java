package classThree.com;

public class Student implements Comparable{

    private int id;
    private String name;
    private int age;
    private int score;

    public Student(){

    }

    public Student(int id,String name,int age,int score){
        this.id=id;
        this.name=name;
        this.age=age;
        this.score=score;
    }

    @Override
    public int compareTo(Object obj) {
        Student student=new Student();
        if (obj instanceof Student){
            student=(Student)obj;
        }
        if (student.score>this.score){
            return 1;
        }else if (student.score==this.score){
            return 0;
        }else {
            return -1;
        }

    }


}
