package FUnctionalInerface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by expert on 29/8/18.
 */
public class Sample
{
    public static void main(String[] args)
    {
        List<Product> ProductsList = new ArrayList<Product>();
        Product p1 = new Product(1,200,"xxx");
        Product p2 = new Product(2,1000,"YYY");
        ProductsList.add(p1);
        ProductsList.add(p2);

        List<String> ProductnameList2 = ProductsList.stream()
                .filter(p -> p.prize>200)
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println(ProductnameList2);
        System.out.println("*****************");


        ProductnameList2.stream().forEach(p -> System.out.println(p));

    }
}
