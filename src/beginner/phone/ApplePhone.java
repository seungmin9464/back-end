package beginner.phone;

public class ApplePhone {
    String modelName;

    ApplePhone(String modelName) {
        this.modelName = modelName;
    }

    public void turnOn() { // 누가 이 메소드를 호출해서 폰을 켜는 걸까?
        System.out.println("@@@ 애플 로고 @@@"); // 누구의 역할? 사람 vs 폰
    }

    public void turnOff() {
        System.out.println("띠로리로");
    }
}
