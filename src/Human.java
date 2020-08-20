public class Human implements Jumper, Runnable  {
    String name;
    int jumpMax = 2;
    public Human(String name){
        this.name = name;
    }
    @Override
    public void jump() {
        System.out.println("Человек" + name + " прыгает.");
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " бегает.");
    }
}


