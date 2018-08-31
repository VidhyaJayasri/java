package second;

import java.util.ArrayList;

/**
 * Created by expert on 14/8/18.
 */
public class Second
{
    public static void main(String[] args) {


        int a[] = {1, 100, 90, 46, 20, 36, 78, 450};
        int max=a[0];
        int min=a[0];


        for (int i = 0; i < a.length; i++)
        {
            if(a[i]>max)
            {
               max=a[i];
            }

        }


        for (int i = 0; i < a.length; i++)
        {
            if(a[i]>=min && a[i]<max)
            {
                min=a[i];
            }

        }



        System.out.println("Largest Number = "+max);
        System.out.println("Second Largest Number = " +min);
    }
}
