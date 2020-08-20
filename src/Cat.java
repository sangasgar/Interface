public class Cat extends Member implements Jumper, Runnable {

    public Cat(String name,  int maxJump,  int maxRun){
        this.name = name;
        this.jumpMax = maxJump;
        this.runMax = maxRun;
    }
    @Override
    public void jump() {

        System.out.println("Кот " + name + " прыгает.");
    }
    @Override
    public void run() {

        System.out.println("Кот " + name + " бегает.");
    }

    @Override
    public void me() {
        int sqt;
        sqt =  this.runMax;
    }
}
