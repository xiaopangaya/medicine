package classThree.com;

public class News implements Comparable{

    private int id;
    private String title;
    private String content;
    private int click;

    public News(){

    }

    public News(int id,String title,String content,int click){
        this.id=id;
        this.title=title;
        this.content=content;
        this.click=click;
    }

    @Override
    public int compareTo(Object obj) {
        News news=new News();
        if (obj instanceof News){
            news=(News)obj;
        }
        if (news.id>this.id){
            return 1;
        }else if(news.id==this.id){
            return 0;
        }else {
            return -1;
        }

    }
}
