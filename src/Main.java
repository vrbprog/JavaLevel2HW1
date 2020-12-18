public class Main {
    public static void main(String[] args) {
        Passable[] passes =  {
                new Cat("Barsik",400,1.2),
                new Man("Ivan",800,0.7),
                new Robot("Verder",10000,1.5),
                new Man("Oleg",1200,0.9),
                new Cat("Tigr",540,1.4)};

        Testable[] tests = {
                new RunningTrack(300),
                new Wall(0.5),
                new RunningTrack(500),
                new Wall(1.3),
                new RunningTrack(700)};

        for (Passable pass : passes) {
            System.out.println(" ");
            for (Testable t : tests) {
                if (!t.test(pass)) {
                    System.out.print("and left the race");
                    break;
                }
            }
        }
        System.out.println("");
    }
}
