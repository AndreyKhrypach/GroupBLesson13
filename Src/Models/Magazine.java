package Models;

import Service.Printable;

public class Magazine implements Printable {

    private String name;

    public String getName(){
        return name;
    }

    public Magazine(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
