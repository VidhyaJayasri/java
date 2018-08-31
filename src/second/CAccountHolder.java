package second;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 10/7/18.
 */
public class CAccountHolder
{
    int accno;
    String name;
    float amount;
    int AIFSC;

    public CAccountHolder(int accno, String name, float amount,int AIFSC)
    {
        this.accno = accno;
        this.name = name;
        this.amount = amount;
        this.AIFSC=AIFSC;
    }

    private  static void display(ArrayList<CAccountHolder>ca)
    {

        //ArrayList<ca>  ac = new ArrayList<>();
        Iterator itr2 = ca.iterator();
        for (CAccountHolder CAobj : ca)
        {
            System.out.println(CAobj.accno + " " + CAobj.name + " " + CAobj.amount + " " + CAobj.AIFSC);
        }

    }



    private  static  void display(ArrayList<CAccountHolder>ca,int num )

    {


        Iterator itr3 = ca.iterator();
        while (itr3.hasNext())
        {
            CAccountHolder obj1 =(CAccountHolder) itr3.next();
            if(obj1.accno==num)
            {
                System.out.println(obj1.accno + " " + obj1.name + " " + obj1.amount + " " + obj1.AIFSC);
            }


    }}

    private  static  void deposit(ArrayList<CAccountHolder>ca,int num,int deptnum )

    {


        Iterator itr4 = ca.iterator();
        while (itr4.hasNext())
        {
            CAccountHolder obj1 =(CAccountHolder) itr4.next();
            if(obj1.accno==num)
            {
                obj1.amount=obj1.amount+deptnum;
                System.out.println(obj1.accno + " " + obj1.name + " " + obj1.amount + " " + obj1.AIFSC);
            }


        }}







    private  static  void withdraw(ArrayList<CAccountHolder>ca,int num,int withdrawamount )

    {


        Iterator itr5 = ca.iterator();
        while (itr5.hasNext())
        {
            CAccountHolder obj4 =(CAccountHolder) itr5.next();
            if(obj4.accno==num)
            {
                obj4.amount=obj4.amount-withdrawamount;
                System.out.println(obj4.accno + " " + obj4.name + " " + obj4.amount + " " + obj4.AIFSC);
            }


        }}


    private  static  void removeaccnt(ArrayList<CAccountHolder>ca,int num )

    {


        Iterator itr8 = ca.iterator();
        while (itr8.hasNext())
        {
            CAccountHolder obj5 =(CAccountHolder) itr8.next();
            if(obj5.accno==num)
            {
                //System.out.println(obj1.accno + " " + obj1.name + " " + obj1.amount + " " + obj1.AIFSC);
                ca.remove(obj5);
            }

            System.out.println("remining account");

            for (CAccountHolder reobj:ca)
            {
                System.out.println(reobj.accno + " " + reobj.name + " " + reobj.amount + " " + reobj.AIFSC);
            }

        }}



    public static void main(String[] args) {
        CBank CBank1 = new CBank("HDFC", 101, "Kayamkulam");
        CBank CBank2 = new CBank("HDFC", 102, "KOllam");
        CAccountHolder CAccountHolder1 = new CAccountHolder(101001, "Vidhya", 15000, 101);
        CAccountHolder CAccountHolder2 = new CAccountHolder(101002, "Veena", 250000, 102);

        ArrayList<CBank> CB = new ArrayList<>();
        CB.add(CBank1);
        CB.add(CBank2);
        ArrayList<CAccountHolder> CA = new ArrayList<>();
        CA.add(CAccountHolder1);
        CA.add(CAccountHolder2);
        Iterator itr = CB.iterator();

            for (CBank Bobj : CB)
            {
                System.out.print(Bobj.bankname + " " + Bobj.ifsc + " " + Bobj.branch);
                System.out.print("\n");
            }

         //   Iterator itr2 = CA.iterator();

       // CAccountHolder1.display();
       display(CA);
      display(CA,101002);
      deposit(CA,101001,500);
      withdraw(CA,101002,50000);
       removeaccnt(CA,101001);


    }



}

