package beginner.shop;

// 프라다를 호출한 애들만 호출 당함
public class Thing {
    String name;

    Thing(String modelName){
        this.name = modelName;
    }

    public String getName(){
        return name;
    }
}
