package RegularEx;

//import first.Pattern;
import java.util.regex.Pattern;

/**
 * Created by expert on 20/7/18.
 */
public class RegExExamp
{
    public static void main(String[] args)
    {

       // System.out.println(Pattern.matches("[\\d]{6}","123456"));

       // System.out.println(Pattern.matches("[1][2][a-zA-Z0-9@#$%]*","12aaA1234ab1"));//starting
        //with 12 .

       // System.out.println(Pattern.matches("(([a-zA-Z0-9])&&([a-z])||([A-Z])||([0-9])){10}","Abcdefgh12"));

        //System.out.println(Pattern.matches("[\\W]*","aaA1234ab1"));


        System.out.println(Pattern.matches("[[a-zA-z0-9]+[a-z]+[0-9]]{10}","1234567891"));

        //System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]+[a-z]+[.][c][o][m]","a123@gmail.com"));
      //  System.out.println(Pattern.matches("[+][9][1]+[0-9]{10}","+917090702944"));



    }
}
