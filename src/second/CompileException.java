package second;

import java.io.IOException;

/**
 * Created by expert on 9/7/18.
 */
public class CompileException
{

    public static void check() throws IOException,ClassNotFoundException
    {
        throw new IOException();
    }
    public static void callcheck() throws IOException, ClassNotFoundException
    {
        check();

    }
    public static void main(String[] args) throws ClassNotFoundException {
     try
     {
      check();
     }
     catch (IOException e)
     {
         System.out.println("Checked Exception");
     }
    }
}

