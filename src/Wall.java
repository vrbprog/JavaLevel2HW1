public class Wall implements Testable{

    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean test(Passable pass) {
        return pass.jump(height);
    }
}
