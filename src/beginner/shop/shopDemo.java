package beginner.shop;

public class shopDemo {
    public static void main(String[] args) {
        Brand prada = new Brand("프라다");        // 프라다 생성자 생성
        Brand gucci = new Brand("구찌");          // 구찌 생성자 생성
        Brand notThing = new Brand("");           // 비어있는 생성자 생성

        Brand[] brands = { prada, gucci, notThing };    // 배열 생성
        int random = (int)(Math.random() * brands.length);    // 랜덤

        if( 0 == random ){
            System.out.println(prada.getName() + prada.buy("가방"));
        } else if ( 1 == random ) {
            System.out.println(gucci.getName() + gucci.buy("옷"));
        } else {
            System.out.println("맘에 드는게 없어요~");    // 비어있을 때 나오는 문구
        }
    }
}
