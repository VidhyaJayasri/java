package second;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by expert on 2/7/18.
 */


public class SampleArray
{



    public void display(int x[])
    {
        for(int i=0;i<x.length;i++)
        {
            for(int j=i+1;j<x.length;j++)
            {

                if(x[i]>x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        System.out.println("After Sorting");

        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = new int[3]; // initializing array with sizw1
        int b[] = {1, 2, 3, 4}; // initializing with size.
        int[] c = new int[4];
        c[0] = 1;
        c[1] = 2;
        c[2] = 4;
        c[3] = 3;
        //int[] d = new int[]{5, 9, 10, 20};
        //int length = d.length;
        for (int i = 0; i <= c.length - 1; i++) {
            System.out.println(c[i]);
        }
        char ch[] = {'a', 'b', 'c', 'd'};
        System.out.println("charactor Array");
        for (int i = 0; i <= ch.length - 1; i++) {
            System.out.println("\n" + ch[i]);
        }

        String str[] = {"One", "Two", "Three"};
      /*  System.out.println("StringArray:- ");
        for (int i = 0; i <= str.length - 1; i++) {
            System.out.print(str[i]+" ");
        }*/
       /* System.out.println("ForEach :- ");
        for (String obj:str)// for each syntax
        {
            System.out.print(obj+" ");
        }*/




       /* Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 value");
        int ar[] = new int[5];

        for(int i=0;i<=ar.length-1;i++)
        {
            ar[i] = s.nextInt();

        }*/

    /*    System.out.println("Array ar[] Values");
for(int i=0;i<=ar.length-1;i++)
{

    System.out.println(ar[i]);
}*/

int [] d = new int []{1,3,6,4,2,5};
        SampleArray obj= new SampleArray();
        obj.display(d);

        int v[][] ={{1,2,3},{4,5,6}};

        System.out.println("2D Array");

        for(int i=0;i<=v.length;i++)
        {
            for(int j=0;j<v[i].length;j++)
            {

                        System.out.print(v[i][j] + " ");
                        ////System.out.print(v[j][k] + " ");



            }
            System.out.println("\n");
        }
    }
}
