import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        System.out.println("***Задание 1***");
        Cat cat = new Cat("Мася",3,2);
        Human human = new Human("Гор",2,10);
        Robot robot = new Robot("Эклипсо",10,50);
        cat.run();
        cat.jump();
        human.run();
        human.jump();
        robot.run();
        robot.jump();
        //2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        System.out.println("***Задание 2***");
        Runnable cat1 = new Cat("Мася",3,2);
        Runnable human1 = new Human("Лена",2,10);
        Runnable robot1 = new Robot("Энекен",10,50);
        Wall wall = new Wall(1,5);
        RunningTrack runningTrack = new RunningTrack(1,20);
        wall.act(cat1);
        wall.act(human1);
        wall.act(robot1);
        runningTrack.act(cat1);
        runningTrack.act(human1);
        runningTrack.act(robot1);
        //3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        //4.* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
        System.out.println("***Задание 3*** и 4");
        Runnable[] runnable = {
          new  Cat("Мася",3,2),
          new Human("Лена",2,10),
          new Robot("Энекен",10,50)
        };
        Obstacle[] obstacles = {
                new Wall(2,5),
                new RunningTrack(2,20)
        };

        for (int i = 0; i < runnable.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].act(runnable[i]);

            }
        }

    }


}