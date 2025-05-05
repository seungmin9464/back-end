package beginner.food;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
//    menu; // 여러개 어떻게 저장하지...? 손님이 불만이 많은데...?

    List<Menu> menus = new ArrayList<>();


    public void addMenu(Menu menu) { // 음식을 받아야 = 객체 지향 세상,, 매개변수
        menus.add(menu);
    }

    public void displayMenu() {
//        for(int idx = 0; idx< menus.size(); idx++){
//            System.out.println("저희 음식점의 메뉴는" + menus.get(idx).returnName() + "입니다.");
//            System.out.println("가격은 " + menus.get(idx).returnPrice() + "원 입니다.");
//            System.out.println("이 메뉴는 " + menus.get(idx).description() + "합니다.");
//        }
    }

//    public void changePrice( menu, int changePrice) {
////        food.price = changePrice;
//        menu.setPrice(changePrice);
//    }
//
//    public void changeMenuName( menu, String changeName){
//    }
}
