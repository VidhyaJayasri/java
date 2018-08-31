package second;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by expert on 12/7/18.
 */
public class Book
{
    String name;
    float price;
    String author;

    public Book(String name, float price, String author)
    {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args)
    {
        LinkedList<Book> Linked = new LinkedList();
        Book b1=new Book("Book1",150,"Author1");
        Book b2=new Book("Book2",250,"Author2");
        Book b3=new Book("Book3",300,"Author3");
        Linked.add(b1);
        Linked.add(b2);
        Linked.add(b3);

        for (Book obj:Linked)
        {
            if(Linked.contains(b1))
            {
                b1.price=b1.price+50;
                System.out.println(obj.name + " " + obj.author + " " + obj.price);
            }

                   }

    }

}
