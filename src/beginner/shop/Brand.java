package beginner.shop;

// 대분류 - 메이커 분류 목적

public class Brand {
    String name;

    public Brand(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String buy(String thing) {
        return "에서 " + thing + " 샀어요";
    }
}
