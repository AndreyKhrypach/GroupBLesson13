package Models;

import Service.Square;
import Service.Stateable;

import static Service.Stateable.CLOSED;
import static Service.Stateable.OPEN;

public class WaterPipe implements Square {
    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }

    @Override
    public int calculate(int x) {
        return 0;
    }
}
