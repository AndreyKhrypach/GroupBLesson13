package Models;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void voice(){
        System.out.println("miau");
    }
}
