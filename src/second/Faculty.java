package second;

/**
 * Created by expert on 4/7/18.
 */
public class Faculty extends Dpartment
{
    int facid;
    String name;

    public Faculty(int deptid,String deptname,int facid, String name)
    {
        super(deptid,deptname);
        this.facid = facid;
        this.name = name;
    }
    public void PrintDetails()
    {
        System.out.println("Deptid="+super.Deptid+" "+"DeptName= "+super.DeptName+" Facid="+facid+" FacName= "+name);
    }

    public static void main(String[] args)
    {
        Faculty f= new Faculty(101,"CSE",1,"Anju");
        f.PrintDetails();


    }
}
