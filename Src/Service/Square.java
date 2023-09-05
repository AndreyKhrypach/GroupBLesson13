package Service;


@FunctionalInterface
public interface Square {
    int calculate(int x);

    default void displaySquare(){
        System.out.println("this is square");
    }
}
