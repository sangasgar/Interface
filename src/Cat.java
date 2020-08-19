public class Cat implements Jumper, Runnable {
    private String name;
    int runMax = 2;
    int jumpMax = 2;
    public Cat(String name){
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
