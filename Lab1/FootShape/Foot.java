
public class Foot {
    private FootShape shape;

    public Foot(FootShape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}