package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Cart {

    @Autowired
    OrderService orderService;

    ArrayList<Product> shoppinglist = new ArrayList<Product>();
    public void add(Product product){

        shoppinglist.add(product);
        System.out.println("Buy");
        System.out.println("Id : "+product.getId());
        System.out.println("Title : "+product.getTitle());
        orderService.finalorder(product);

    }
}
