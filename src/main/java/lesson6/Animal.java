package lesson6;

public class Animal {
    public String name;

    public Animal (int run, int swim){
        int runLength = run;
        int swimLength = swim;
    }

    public void Run (int run){
        System.out.println(name + " пробежал " + run);
    }
    public void Swim (int swim){
        System.out.println(name + " проплыл " + swim);
    }
}
