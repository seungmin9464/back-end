package beginner.shop;

// 대분류 - 메이커 분류 목적

public class Brand {
    String name;

    public Brand(String name){
        this.name = name;
    }

    public void buy(Thing thing) {
        System.out.println("에서 " + thing.getName() + "구매습니다.");
    }
}
