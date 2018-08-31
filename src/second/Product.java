package second;

/**
 * Created by expert on 3/7/18.
 */
public class Product {
    int id;
    String name;
    int prize;

    public Product(int id, String name, int prize)
    {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }

    public static void main(String[] args)
    {
        Product P = new Product(1,"prod1",100);
        Product P1 = new Product(2,"prod2",1000);
        Product P2 = new Product(3,"prod3",2000);
        Product Parray[]={P,P1,P2};
        for(Product obj:Parray)
        {

            if(obj.prize>=1000)
            {
                System.out.println(obj.id+" " +obj.name+" "+obj.prize);
            }
        }

    }
}
