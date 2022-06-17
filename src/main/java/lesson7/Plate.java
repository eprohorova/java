package lesson7;

public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;
    }
    public void decriesFood(int appetite){
        if (food >= appetite){
            food -= appetite;
            System.out.println("Кот поел");
        }

        if (food < appetite){
            System.out.println("Кот не смог поесть, положите ещё корм");
        }
    }
    public void addFood() {
        if (food <=0){
            food++;
            System.out.println("Добавили ещё еды");
        }
    }

    public void checkPlat(boolean satiety){
        if (food >= 75){
            satiety = true;
        }
    }

    public void info() {
        System.out.println(food);
    }



}
