package second;

/**
 * Created by expert on 14/8/18.
 */
public class SecondLargestArray
{
    public static void main(String[] args)
    {
       int a[] = {100,74,30,46,20,36,78,45};

         for(int i=0;i<a.length;i++)
         {
            for(int j=i+1;j<a.length;j++) {

                if (a[i]<a[j])
                {
                 int temp = a[i];
                 a[i]=a[j];
                 a[j]=temp;
                }


            }
         }

       /*  for(int i=0;i<a.length;i++)
         {
             System.out.println(a[0]);
         }*/

        System.out.println(a[0]);

        System.out.println(a[1]);
    }
}
