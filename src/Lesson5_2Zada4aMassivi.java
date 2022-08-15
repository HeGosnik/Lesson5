import java.util.Arrays;

public class Lesson5_2Zada4aMassivi {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][10];
        int counter=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++){
                arr1[i][j]=counter++;
            }
            System.out.println(Arrays.toString(arr1[i]));//вывод в 2х мерном
        }
       // System.out.println(Arrays.deepToString(arr1));//вывод в одномерном
    }
}
