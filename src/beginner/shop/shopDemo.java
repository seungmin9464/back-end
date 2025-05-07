package beginner.shop;

public class shopDemo {
    public static void main(String[] args) {
        Brand prada = new Brand("프라다");
        Brand gucci = new Brand("구찌");
        Brand notThing = new Brand("");

        Brand[] brands = { prada, gucci, notThing };
        int random = (int)(Math.random() * brands.length);

        if( 0 == random ){
            System.out.println(prada.getName() + prada.buy("가방"));
        } else if ( 1 == random ) {
            System.out.println(gucci.getName() + gucci.buy("옷"));
        } else {
            System.out.println("맘에 드는게 없어요~");
        }
    }
}
