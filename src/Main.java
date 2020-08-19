public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мася");
        cat.run();
        RunningTrack run = new RunningTrack(1);
        run.run(cat);

    }
}
