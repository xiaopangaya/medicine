package classThree.com;

public class Text {
    public static void main(String[] args) {
        var x=new String("asdasd");
        System.out.println(x);
    }

    private static void text4() {
        Rabbit rabbit=new Rabbit("兔子","白色","哺乳类");
        Frog frog=new Frog("青蛙","绿色","非哺乳类");
        System.out.println("兔子:");
        rabbit.Eat();
        rabbit.Speak();
        System.out.println("青蛙:");
        frog.Eat();
        frog.Speak();
        frog.swimming();
    }

    private static void text3() {
        AmphibiousArtist amphibiousArtist=new AmphibiousArtist();
        amphibiousArtist.PlayInMovie();
        amphibiousArtist.ActingTVSeries();
        amphibiousArtist.SingSong();
    }

    private static void text2() {
        VideaCard videaCard=new VideaCard();
        AudioCard audioCard=new AudioCard();
        NetCard netCard=new NetCard();
        videaCard.send();
        audioCard.send();
        netCard.send();
    }

    private static void text1() {
        Student student1=new Student(101,"张三",20,70);
        Student student2=new Student(102,"李四",21,85);
        int is=student1.compareTo(student2);
        if (is>0){
            System.out.println("李四的分数高");
        }else if(is<0){
            System.out.println("张三的分数高");
        }else if(is==0){
            System.out.println("张三、李四的分数一样高");
        }
        News news1=new News(201,"常州日报","常州工学院nb",30000);
        News news2=new News(202,"如皋日报","青软实训nb",40000);
        int isNews=news1.compareTo(news2);
        if (isNews>0){
            System.out.println("常州日报的编号在前");
        }else if (isNews==0){
            System.out.println("常州日报的编号与如皋日报编号一样");
        }else if (isNews<0){
            System.out.println("如皋日报的编号在前");
        }
    }
}
