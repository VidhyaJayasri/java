package Samples;

/**
 * Created by expert on 28/6/18.
 */
public class Example {


    public static void main(String[] args) {
        // int i=2;
        // int k=i++;
        //int z=++i;  //increment
        //int y=10;
        // int j=--y;  // decrement
        //System.out.println("k = "+k);
        //System.out.println("z = "+z);
        //System.out.println("j = "+j);
        int a = 60;
        int b = 30;
        int c = 20;
        if ((a != b) && (a == c)) {
            System.out.println("Both the conditions are true");
        }
        else if ((a != b) || (a == c)) {
            System.out.println("one of the condition is true");
        }
        else {
            System.out.println("Both the conditions are not satisfying");
        }
    }
}