public class Human extends Member implements Jumper, Runnable  {

    public Human(String name,  int maxJump,  int maxRun){
        this.name = name;
        this.jumpMax = maxJump;
        this.runMax = maxRun;

    }
    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгает.");
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " бегает.");
    }
    @Override
    public void me() {
        int sqt;
        sqt =  this.runMax;
    }
}


