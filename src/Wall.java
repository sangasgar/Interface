public class Wall  implements Jumper {

    @Override
    public void jump() {
        System.out.println("Участник прыгает");
    }
    public static void runningTrack(Runnable r) {
        r.run();
    }
}

