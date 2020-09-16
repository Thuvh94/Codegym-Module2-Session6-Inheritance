public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(5,10);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle("black",true,5.7,4.2);
        System.out.println(rectangle3);
    }
}
