import java.sql.SQLOutput;

public class RunningTrack implements  Obstacle  {
    int i;
    int count = 1;
    int dist = 0;

    public RunningTrack(int i, int dist) {
        this.i = i;
        this.dist = dist;
        System.out.println("Дорожка " + i);
    }


    @Override
    public void act(Runnable ob) {

        System.out.println("Участник " + count + " бегает по беговой дорожке.");
        count++;
    }

    @Override
    public void act(Jumper ob) {
        System.out.println("Участник " + count + " бегает по беговой дорожке.");
        count++;
    }
}
