package beginner.phone;

/**
 * 실행용 클래스 = 실행하기 위한 클래스 = main 메서드가 있다
 */
public class PhoneDemo {
    public static void main(String[] args) { // 객체 지향 세상
        Person songa = new Person("손가");
        ApplePhone iPhone12mini = new ApplePhone("iPhone12mini");

        songa.buy(iPhone12mini); // "아이폰220"); <- 이건.. 문자를 사는 것...
        songa.sayJarang();

//        songa.buy("고아라폰");
//        songa.sayJarang();

        // 여러분 객체 등장! buy() 까지
        Person youngmun = new Person("영문");
        SamsungPhone galaxy24 = new SamsungPhone("갤럭시24");
        youngmun.buy(galaxy24);
        youngmun.sayGalaxyJarang();

        Person seonghoon = new Person("성훈");
        ApplePhone iPhone15ProMax = new ApplePhone("iPhone15ProMax");
        seonghoon.buy(iPhone15ProMax);
        seonghoon.sayJarang();
        seonghoon.turnOnPhone();
        seonghoon.turnOffPhone();
    }
}
