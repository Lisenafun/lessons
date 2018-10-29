package lesson4;

public class Good {
    //свойства, private - доступны только внутри класса
    private String title;
    private int price;
    //метод - действие
    public Good(){
    }
    public Good(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public Good(String title) {
        this.title = title;
    }

    public Good(int price) {
        this.price = price;
    }

    //void - метод не возвращает значения, () - аргумент
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() { //тип данных, который должен вернуться
        return "Good{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
