package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal(150, 0);
        Animal dog = new Animal(250, 6);

        //Cat cat1 = new Cat(200,0);
        //Dog dog1 = new Dog(500,10);

        cat.name = "Оракал";
        dog.name = "Шарп";

        cat.Run(150);
        dog.Run(250);
        cat.Swim(0);
        dog.Swim(6);

        cat.Run(200);
        dog.Run(500);
        cat.Swim(0);
        dog.Swim(10);
    }
}
