package second;


import java.util.Scanner;

/**
 * Created by expert on 2/7/18.
 */
public class ArrayExample
{

    public static void main(String[] args)
    {



        int a[][] = {{12,1,3,},{0,5,4}};

        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
               for(int k=j+1;k<a[0].length;k++)
               {
                   if(a[i][j]>a[i][k])
                   {
                       int temp =a[i][j];
                       a[i][j]=a[i][k];
                       a[i][k]=temp;
                   }
               }
            }

        }

        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }

            }
    }

