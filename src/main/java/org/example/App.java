package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        abstract class Animal{
            void move(){};
        }
        class Cat extends Animal{

            void move(){
                System.out.println("Я побежал");
            };

        }
        class Fish extends Animal{

            void move(){
                System.out.println("Я поплыла");
            };

        }
        class Duck extends Animal{

            void move(){
                System.out.println("Я полетела");
            };
        }

        Cat cat = new Cat();
        Fish fish = new Fish();
        Duck duck = new Duck();

        cat.move();
        fish.move();
        duck.move();

    }
}
