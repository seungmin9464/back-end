package beginner.food;

public class Food extends Menu{
/*    private String name; // 돈까스
    private int price; // 가격
    private String description;*/

    Food(String name, int price, String description) {
        super(name, price, description); // = 조상의 생성자 == Menu();
/*        this.name = name;
        this.price = price;
        this.description = description;*/
    }
}