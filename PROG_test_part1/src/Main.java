import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[][] speed = new int[][]{{128, 135, 139},{155,129,175},{129,130,185},{195,155,221}};
       String[][] city ={new String[]{"JHB"}, new String[]{"DBN"}, new String[]{"CTN"}, new String[]{"PE"}};
       String[] months = {"JAN","FEB","MAR"};
        System.out.println("******************************************");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("******************************************");
        System.out.println(Arrays.toString(months));

//i hate for loops
        for (int i;;) {
            i = 0;
            i < speed.length - 1;
            i++;
            System.out.println(Arrays.deepToString(speed[i]));


            for (int j; ; ) {
                j = 0;
                j < speed[i].length - 1;
                j++;
                System.out.println(Arrays.deepToString(speed[i][j]));
            }
        }
            System.out.println("******************************************");


        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("******************************************");

        
        
        
        
        
        
      }
            
            
            
            
        


        

}
