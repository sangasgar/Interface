public class Robot implements Jumper, Runnable  {
    String name;
    int jumpMax = 2;
    public Robot(String name){
        this.name = name;
    }
    @Override
    public void jump() {
        System.out.println(name + " прыгает.");
    }

    @Override
    public void run() {
        System.out.println(name + " бегает.");
    }
}
