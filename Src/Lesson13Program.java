import Models.*;
import Service.Printable;
import Service.Printer;
import Service.Square;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lesson13Program {

    public static void main(String[] args) {

        Printable printable = new Book("Test", "Mike");
        Book book = (Book) printable;


//        String[] names = new String[]{
//                "Greek", "Google", "g1", "QA", "Ground2"};
//
//        // declare the predicate type as string and use
//        // lambda expression to create object
//        Predicate<String> p = (s) -> s.startsWith("G");
//
//        // Iterate through the list
//        for (String st : names) {
//            // call the test method
//            if (p.test(st))
//                System.out.println(st);
//        }
//
//        Stream.of(names).forEach(s -> System.out.println(s));
//        Stream.of(names).forEach(System.out::println);
//


//        // create a list of strings
//        List<String> names = Arrays.asList(
//                "Geek", "GeeksQuiz", "g1", "QA", "Geek2");
//
//        // declare the predicate type as string and use
//        // lambda expression to create object
//        Predicate<String> p = (s) -> s.startsWith("G");
//
//        // Iterate through the list
//        for (String st : names) {
//            // call the test method
//            if (p.test(st))
//                System.out.println(st);
//        }
//
//        Stream.of(names).forEach(s -> System.out.println(s));
//        Stream.of(names).forEach(System.out::println);

//        Animal animal = new Animal("Cat");
//        animal.voice();
//
//        Animal cat = new Cat("super cat");
//        cat.voice();

//        int a = 5;
//
//        // lambda expression to define the calculate method
//        Square s = (int x) -> x * x;
//
//        Square square = new Square() {
//            @Override
//            public int calculate(int x) {
//                return x * x;
//            }
//        };

        // parameter passed and return type must be
        // same as defined in the prototype
//        int ans = s.calculate(a);
//        System.out.println(ans);
//
//        System.out.println( square.calculate(a));

//        Printable printable = createPrintable("Foreign Affairs",false);
//        printable.print();
//
//        read(new Book("Java for impatients", "Cay Horstmann"));
//        read(new Magazine("Java Dayly News"));
//
//        Printable book = new Book("Java for impatients", "Cay Horstmann");
//        Printable magazine = new Magazine("Java Dayly News");
//        read(book);
//        read(magazine);
//        read(printable);


//        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//        printable.print();      //  Java. Complete Reference (H. Shildt)
//        printable = new Magazine("Foreign Policy");
//        printable.print();      // Foreign Policy


//        Printable.read();

//        WaterPipe pipe = new WaterPipe();
//        pipe.printState(1);

//        Printer.Printable p = new Journal("Foreign Affairs");
//        p.print();

//        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
//        b1.print();
    }

    static void read(Printable printable){

        printable.print();
    }

    static Printable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Undefined");
        else
            return new Magazine(name);
    }
}
