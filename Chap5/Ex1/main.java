package Ex1;
public class main {
    public static void main(String[] args) {
        Point begin = new Point(2, 4);
        Point end = new Point(3, 5);
        LineSub line = new LineSub(begin, end);

        System.out.println(line.getBegin());

        System.out.println(line);
    }
}