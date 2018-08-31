package second;


/**
 * Created by expert on 27/6/18.
 */
public class department
{
    int did;
    String deptname;
   public department(int d,String name)
    {
        did=d;
        deptname=name;
    }
    public void details()
    {
       System.out.println("department id= "+did+"department name="+deptname);
    }
}
