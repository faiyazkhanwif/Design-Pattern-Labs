/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author faiya
 */
abstract class Animal {

    public abstract String sound();
}

interface Edible {

    String howtoEat();
}

class Tiger extends Animal {

    @Override
    public String sound() {
        String noise = "Tiger: RROOAARR";
        return noise;
    }
}

class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        String noise = "Chicken: cock-a-doodle-doo";
        return noise;
    }

    @Override
    public String howtoEat() {
        String process = "Chicken: Fry it";
        return process;
    }

}

class Fruit implements Edible {

    @Override
    public String howtoEat() {
        String process = "";
        return process;
    }

}

class Apple extends Fruit {

    @Override
    public String howtoEat() {
        String process = "Apple: Make apple cider";
        return process;
    }
}

class Orange extends Fruit {

    @Override
    public String howtoEat() {
        String process = "Orange: Make orange juice";
        return process;
    }
}

public class TestEdible {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howtoEat());
            }
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
        }
    }
}
