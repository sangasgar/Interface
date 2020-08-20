public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мася");
        Jumper j = h -> {
            System.out.println(h + " Все круто");
        };

        Runnable[] runnable = {
          new Cat("Барсик"),
          new Robot("Джон"),
          new Human("Вова")
        };
        for (Runnable r : runnable) {
            r.run(5);
        }

        runningTrack(runnable);
    }


    public static void runningTrack(Runnable[] runnable) {
        for (Runnable r : runnable
             ) {
            r.run();
        }

    }
    public void Lam(int name) {
        System.out.println("Лямбда выражения");
    }

}