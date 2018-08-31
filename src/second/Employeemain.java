package second;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 10/7/18.
 */
public class Employeemain
{
    public static void main(String[] args)
    {
        EmployeesCollection EmployeesCollection1 =new EmployeesCollection("vidhya",1000000,"CSE");
        EmployeesCollection EmployeesCollection2 =new EmployeesCollection("Ammu",150000,"ECE");
        ArrayList<EmployeesCollection> ae= new ArrayList<>();
        ae.add(EmployeesCollection1);
        ae.add(EmployeesCollection2);

       /* for (EmployeesCollection emp: ae)
        {
            System.out.print(emp.empname+" "+ emp.salary+" "+emp.dept);
            System.out.print("\n");
          //  System.out.println(emp.salary+" ");
           // System.out.println(emp.dept);

        }*/
        Iterator itr = ae.iterator();
        while (itr.hasNext())
        {

            EmployeesCollection obj =(EmployeesCollection) itr.next();

            System.out.println(obj.salary+" " +obj.empname+" "+obj.dept);

            ae.remove(obj);
        }


    }
}
