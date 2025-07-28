import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[][] marks = {{20,50,10},{80,25,15},{60,100,35},{75,40,45}};
        
        // loops twice as it is a two dimensionak array
        for (int i = 0; i< marks.length; i++) {

            for (int j = 0; j< marks.length-1; j++){
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }



    }
}

