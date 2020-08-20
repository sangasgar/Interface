public class Wall  implements  Obstacle {
    int i;
    int count = 1;
    int height = 0;

    public Wall(int i, int height) {
        this.i = i;
        this.height = height;
        System.out.println("Стена " + i);
    }
    @Override
    public void act(Jumper ob) {
        System.out.println("Участник " + count + " прыгнул");
        count++;
    }

    @Override
    public void act(Runnable ob) {
        System.out.println("Участник " + count + " прыгнул");
        count++;
    }

}

