public class Robot extends Member implements Jumper, Runnable  {

    public Robot(String name,  int maxJump,  int maxRun){
        this.name = name;
        this.jumpMax = maxJump;
        this.runMax = maxRun;
    }
    @Override
    public void jump() {
        System.out.println("Робот " + name + " прыгает.");
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " бегает.");
    }
    @Override
    public void me() {
        int sqt;
        sqt =  this.runMax;
    }
}
