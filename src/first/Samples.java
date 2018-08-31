package first;

/**
 * Created by expert on 29/6/18.
 */
public class Samples
{
    public static void main(String[] args)
    {
      int count =5;
        int count1 =5;

      for(int i=0;i<5;i++)
      {
         System.out.println("i= "+i);
      }

      while(count!=0)
      {
          System.out.println("Count = "+count);
          count--;
      }
      do
      {
          System.out.println("Count in do  = "+count1);
          count1--;

      } while(count1!=0);
    }
}
