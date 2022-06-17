package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        SumHomeWork1(8,15);
        HomeWork2(18);
        HomeWork3(-15);
        HomeWork4(5, "string");
        HomeWork5();
    }

    public static int SumHomeWork1(int num1, int num2) {

        int result = num1+num2;
        if ((result >= 10) && (result<=20)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        return result;
    }
    public static void HomeWork2(int a){
            if (a>=0){
                System.out.println("Положительное");
            }else {
                System.out.println("Отрицательное");
            }
    }
    public static int HomeWork3(int c){
            if (c>=0){
                System.out.println("false");
            }else {
                System.out.println("true");
            }
            return c;
    }
    public static void HomeWork4(int i, String s){
        for ( i = 0; i < 5; i++){
                System.out.println(s);
        }
    }
    public static void HomeWork5(){
        int god = 2022;
        if ((god % 4 == 0)||(god % 400 == 0)){
            System.out.println("високосный - true");
        }else if (god % 100 != 0){
            System.out.println("не високосный - false");
        }else {
            System.out.println("не високосный - false");
        }
    }
}
