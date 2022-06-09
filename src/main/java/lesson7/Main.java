package lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(200);
        Cat cat1 = new Cat("Ора", 80);
        Cat cat2 = new Cat("Шарп", 85);
        Cat cat3 = new Cat("Крисп", 75);

        Cat[] cats = {cat1, cat2, cat3};
        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
            cats[i].info();
        }


        plate.info();

        cat1.checkSatiety(plate);
        cat1.checkSatiety(plate);
        cat1.checkSatiety(plate);

        plate.info();

        plate.addFood();


    }
}
