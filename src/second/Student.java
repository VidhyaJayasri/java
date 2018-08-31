package second;

/**
 * Created by expert on 3/7/18.
 */
public class Student
{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args)
    {

       Student S= new Student(1,"Anu");
       Student S1= new Student(2,"ammu");
       Student sarray[] = {S, S1};

       for(Student obj:sarray)
        {
            System.out.println(obj.id+" " +obj.name);

        }


    }
}
