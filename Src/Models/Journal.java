package Models;

import Service.Printer;

public class Journal implements Printer.Printable {

    String name;

   public Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
