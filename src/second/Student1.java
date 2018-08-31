package second;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

/**
 * Created by expert on 12/7/18.
 */
public class Student1 implements Comparable<Student1>// for inserting object into a tree
{

    int rollno;
    String name;
    int age;

    public Student1(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args)
    {
        TreeSet<Student1> obj= new TreeSet<Student1>();
        obj.add(new Student1(1,"Vidhya",26));
        obj.add(new Student1(2,"Divya",20));
        obj.add(new Student1(3,"Meenu",8));

        for (Student1 o:obj)
        {
            System.out.println(o.rollno+" "+o.name+" "+o.age);
        }
    }


    @Override
    public int compareTo(@NotNull Student1 o) {

        if(rollno>o.rollno) {
            return 1;
        }
        else if(rollno<o.rollno)
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}
