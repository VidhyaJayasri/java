package FUnctionalInerface;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by expert on 29/8/18.
 */
public class Product {
    int prodid;
    int prize;
    String name;

    public Product(int prodid, int prize, String name) {
        this.prodid = prodid;
        this.prize = prize;
        this.name = name;
    }

    public static void main(String[] args) {


        ArrayList<Product> al = new ArrayList<>();
        Product p1 = new Product(1,200,"xxx");
        Product p2 = new Product(2,300,"YYY");
        Product p3 = new Product(3,500,"zzz");
        al.add(p1);
        al.add(p2);
        al.add(p3);
        //for (Product obj:al) {
        //    System.out.println(" prodid= "+obj.prodid+" prize= "+obj.prize+" Name= "+obj.name);
        //
              Stream<Product> p=al.stream();
       // p.map(x -> x).forEach(z->{
        //    System.out.println(z.prodid+" "+z.prize+" "+z.name);
        //});

       p.filter(x -> x.prize >200).forEach(m ->{
                   System.out.println(m.prodid+" "+m.prize+" "+m.name);
                });



    }
}