package beginner.phone;

public class Person {
    String name;
    ApplePhone applePhone; // String modelName;
    SamsungPhone samsungPhone;

    Person(String name) {
       this.name = name;
    }

    public void buy(ApplePhone applePhone) {
        // ApplePhone iPhone12mini = new ApplePhone(modelName);
        this.applePhone  = applePhone;
        System.out.println(name + "(이)가 " + applePhone.modelName + "을 샀습니다.");
    }

    public void buy(SamsungPhone samsungPhone) {
        this.samsungPhone = samsungPhone;
        System.out.println(name + "(이)가 " + samsungPhone.modelName + "을 샀습니다.");
    }

    // 자랑 메소드 : 출력 "나 modelName 폰 샀다!"
    public void sayJarang() { // String modelName) {
        System.out.println("나 " + applePhone.modelName + " 폰 샀다!");
    }

    public void sayGalaxyJarang() {
        System.out.println("나 " + samsungPhone.modelName + " 폰 샀다!");
    }

    public void turnOnPhone() {
        System.out.println(name + "(이)가 " + applePhone.modelName +"를 켰습니다.");
        applePhone.turnOn();
    }

    public void turnOffPhone() {
        System.out.println(name + "(이)가 폰을 껐습니다.");
        applePhone.turnOff();
    }
}
