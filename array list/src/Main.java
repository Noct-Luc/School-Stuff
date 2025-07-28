import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//array list that displays names
       ArrayList <String> names = new ArrayList<String>();
       //adds names
        names.add("Lux");
        names.add("Anex");
        names.add("Sma");
        names.add("Nanka");
        names.add("Anitha");
        names.add("Pain");
        names.add("Suffering");
//replaces names
        names.set(2,"homer");
        names.set(4,"simpson");
        //removes names
        names.remove(0);
        names.remove(5);
        System.out.println(names);


    }
}