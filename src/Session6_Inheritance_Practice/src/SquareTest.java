public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(5);
        System.out.println(square2);

        Square square3 = new Square("red",true,4);
        System.out.println(square3);
    }
}
