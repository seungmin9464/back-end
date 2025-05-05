package beginner.food;

public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant songaheaven = new Restaurant();

        Food donkatsu = new Food("돈까스", 12000, "바삭바삭");
        Food jjolmyeon = new Food("쫄면", 7000, "쫄깃쫄깃");

        Drink zerocoke = new Drink("제로콜라", 2000, "시원");

        // 손가천국아, 돈까스 좀 메뉴로 추가해봐
        songaheaven.addMenu(donkatsu);
        songaheaven.addMenu(zerocoke);


        // 손가천국아, 너가 가지고 있는 메뉴가 뭐야?
        songaheaven.displayMenu(); // 저희 ~ 원 입니다.

        // 손가천국, 돈까스 가격 6000원 바꿈
//        songaheaven.changePrice(donkatsu, 6000);
//        songaheaven.changePrice(jjolmyeon, 8000);
//
//        songaheaven.changeMenuName(donkatsu, "돼지튀김");
//        songaheaven.changeMenuName(jjolmyeon, "쫄면500원");

    }
}
