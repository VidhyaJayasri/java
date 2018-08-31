package Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by expert on 18/7/18.
 */
public class Bufferex

{
    public static void main(String[] args) throws IOException
    {

        System.out.println("Input a Line");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader reader=new BufferedReader(new Inpu);
        String line=reader.readLine();
        System.out.println(line);
    }
}
