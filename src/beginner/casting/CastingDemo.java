package beginner.casting;

public class CastingDemo {
    public static void main(String[] args) {
        // 차(분류) <- 페라리, 캐스퍼, 티코, 마티즈, ...
        // 내가 바로 객체 지향의 아버지, 이 세상의 조물주
        // Car car = new Ferrari(); // new Car(); cf. 장난감 상자 차/비행기/곰돌이
//        Ferrari ferrari = (Ferrari) new Car();
        // Ferrari ferrari = (Ferrari) car;

        // car.bbangbbang();

        Car car = new Car();
        Car ferrari = new Ferrari();
        Car casper = new Casper();

        Person hyunjung = new Person();
        hyunjung.buyCar(casper);




//        Person daehwa = new Person();
//        Casper casper = new Casper();
//        daehwa.buyCar(casper);
//        daehwa.pressBbang(); // "삥삥"
//
//        Ferrari ferrari = new Ferrari();
//        daehwa.buyCar(ferrari);
    }
}
