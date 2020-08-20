public class Cat implements Jumper, Runnable {
    private String name;

    int jumpMax = 2;
    public Cat(String name){
        this.name = name;
    }
    @Override
    public void jump() {

        System.out.println("Кот " + name + " прыгает.");
    }

    @Override
    public void run(int runMax) {

        System.out.println("Кот " + name + " бегает.");
    }
}
