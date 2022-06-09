package lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;


    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat (Plate ForFood){
        ForFood.decriesFood(appetite);
    }

    public void checkSatiety(Plate checkFood){
        checkFood.checkPlat(satiety);
    }

    public void info(){
        System.out.println(name + " " + appetite);
    }
}
