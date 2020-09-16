public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(5.6);
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());

        Circle circle3 = new Circle("yellow",false,3.3);
        System.out.println(circle3);
    }
}

