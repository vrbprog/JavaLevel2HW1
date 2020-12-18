public class RunningTrack implements Testable{

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean test(Passable pass) {
        return pass.run(length);
    }
}
