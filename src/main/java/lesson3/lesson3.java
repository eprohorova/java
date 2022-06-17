package lesson3;

public class lesson3 {
    public static void main(String[] args) {
       Mass1();
       Mass2();
       Mass3();
       Mass4();
       Mass5(2,4);
    }
    public static void Mass1(){
        int[] arr = {0,1,0,0,1,1,0};
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] >= 1){
                System.out.println(0);
            }else {
                System.out.println(1);
            }
        }
    }public static void Mass2(){
        int[] arr = new int [100];
        //Random random = new Random();
        //int x = random.nextInt(100);
        for (int i = 1; i <= arr.length; i++){

            System.out.println(i);
        }
    }
    public static void Mass3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] <= 6){
                arr[i] *=2;
                System.out.println(arr[i]);
            }else {
                System.out.println(arr[i]);
            }
        }
    }
    public static void Mass4(){
        int[][] arr = new int[4][4];
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr.length; b++){
                if (a == b){
                    System.out.print(1 + "  ");
                }
                else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }

    }
    public static int[] Mass5 (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

}
