package classFour.com;

public class Book {
    private int id;
    private String name;
    private int price;
    private String press;

    public Book(){

    }
    public Book(int id,String name,int price,String press){
        this.id=id;
        this.name=name;
        this.price=price;
        this.press=press;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }
}
