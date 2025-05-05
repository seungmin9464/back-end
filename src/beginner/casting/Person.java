package beginner.casting;

public class Person {
/*    Casper myCar1;
    Ferrari myCar2;*/

    Car myCar;

    public void buyCar(Car myCar) {
         this.myCar = myCar;
    }

//    public void buyCar(Ferrari ferrari) {
//        this.myCar2 = ferrari;
//    }

    public void pressBbang() {
        myCar.bbangbbang();
    }
}
