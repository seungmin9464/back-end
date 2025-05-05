package beginner.food;

public class Menu {
    private String name; // 이름
    private int price; // 가격
    private String description;

    Menu(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
