import java.sql.Array;
import java.util.Arrays;

public class Lesson5_1Massivi {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][];
        arr1[0] = new int[1];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        arr1[3] = new int[4];
        arr1[0][0] = 0;
        arr1[1][0] = 0;
        arr1[2][0] = 0;
        arr1[3][0] = 0;
        arr1[1][1] = 1;
        arr1[2][1] = 1;
        arr1[3][1] = 1;
        arr1[2][2] = 2;
        arr1[3][2] = 2;
        arr1[3][3] = 3;
        System.out.println(Arrays.deepToString(arr1));
    }
}
