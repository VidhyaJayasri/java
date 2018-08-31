package first;

import java.net.SocketPermission;

/**
 * Created by expert on 29/6/18.
 */
public class Pattern {

    public void printpattern(int n)
    {
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<i;j++)
           {

                   System.out.print(j+ " ");

           }
           System.out.println(" ");
       }

    }
    public static void main(String[] args) {
        Pattern p= new Pattern();
        p.printpattern(5);
    }
}
