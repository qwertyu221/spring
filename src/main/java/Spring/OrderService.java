package Spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class OrderService {
    ArrayList<Product> order = new ArrayList<Product>();
    public void finalorder(Product product){
        order.add(product);
        int summ = 0;
        for (Product person : order) {


            summ = summ + person.getCost();


        }
        System.out.println("Cost : "+summ);

    }



}
