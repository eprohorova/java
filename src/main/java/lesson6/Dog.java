package lesson6;

public class Dog extends Animal{

    //public String name;

    public Dog(int run, int swim) {
        super(run, swim);
    }
    public void Run (int run){
        System.out.println(this.name + " пробежал " + run);
    }
    public void Swim (int swim){
        System.out.println(this.name + " проплыл " + swim);
    }
}
