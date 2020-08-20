public interface Obstacle {
    default void act (Runnable ob) {
        System.out.println("...Run...Error");
    };
    default void act (Jumper ob){
        System.out.println("...Jump...Error");
    };
}
