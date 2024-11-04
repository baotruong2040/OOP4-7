package Ex5;

public class Main {
    public static void main(String[] args) {
        ResizableCircle c1 = new ResizableCircle(4);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1);

        c1.resize(50);
        System.out.println(c1.radius);
    }
}
