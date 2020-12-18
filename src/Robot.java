public class Robot implements Passable{
    private final String name;
    private final int maxLength;
    private final double maxHeight;

    public Robot(String name, int maxLength, double maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int length) {
        if(length <= maxLength){
            System.out.print("Robot " + name + " ran " + length + " - ");
            return true;
        }else{
            System.out.print("Robot " + name + " didn't run " + length + " - ");
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if(height <= maxHeight){
            System.out.print("Robot " + name + " jumped " + height + " - ");
            return true;
        }else{
            System.out.print("Robot " + name + " didn't jump " + height + " - ");
            return false;
        }
    }
}
