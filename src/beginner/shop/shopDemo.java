package beginner.shop;

public class shopDemo {
    public static void main(String[] args) {
        Brand prada = new Brand("프라다");
        Brand gucci = new Brand("구찌");
        Brand notThing = new Brand("");

        Brand[] brands = { prada, gucci, notThing };

        int random = (int)(Math.random() * brands.length);

        if( 0 == random /*prada == wantPrada*/ ){
            System.out.println(prada.name + "에서 가방을 샀어요");
        } else if ( 1 == random /*gucci == wantGucci*/ ) {
            System.out.println(gucci.name + "에서 옷을 샀어요");
        } else {
            System.out.println("맘에 드는게 없어요~");
        }
    }
}
