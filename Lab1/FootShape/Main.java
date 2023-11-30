import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
        int shapeType = scanner.nextInt();

        Foot foot;
        if (shapeType == 1) {
            foot = new Foot(new Ellipse());
        } else {
            foot = new Foot(new Rectangle());
        }

        foot.draw();
    }
}
