import java.sql.SQLOutput;

public class RunningTrack implements Runnable {
    int Lenght;
    public RunningTrack (int Lenght){
        this.Lenght = Lenght;
    }
    public void run(Cat cat) {
        if (Lenght > Runnable.lenght) {
            System.out.println("Кошка не смогла пробежать.");
        } else {
            System.out.println("Кошка успешно пробежала.");
        }
    }
    public void run(Human human) {
        if (Lenght > Runnable.lenght) {
            System.out.println("Человек не смог пробежать.");
        } else {
            System.out.println("Человек успешно пробежал.");
        }
    }
    public void run(Robot robot) {
        if (Lenght > Runnable.lenght) {
            System.out.println("Робот не смог пробежать.");
        } else {
            System.out.println("Робот успешно пробежал.");
        }

    }

    @Override
    public void run() {
        System.out.println("Беговая дорожка для бега");
    }
}
