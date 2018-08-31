package Files;

import sun.security.util.Length;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by expert on 19/7/18.
 */
public class buff {
    public static void main(String[] args) throws IOException {

        System.out.println("Input a Line");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader reader=new BufferedReader(new Inpu);
        String line = reader.readLine();
        ArrayList<String> al = new ArrayList<String>();
        String a[] = line.split(" ");

        for (String obj : a) {
          al.add(obj);
        }

        for (String obj2 : al)
        {
            System.out.println(obj2);
        }
    }
}

