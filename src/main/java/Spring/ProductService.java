package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("prser")
public class ProductService {

    ArrayList<Product> productservice1 = new ArrayList<Product>();

    public void printAll(){
        for (Product person : productservice1) {
            System.out.println("Id : "+person.getId());
            System.out.println("Title : "+person.getTitle());
            System.out.println("Cost : "+person.getCost());

        }

    }

    @Autowired
    Cart cart;

    public void findbytitle(String title){
        for (Product person : productservice1) {
            if(title.equals(person.getTitle())){

                cart.add(person);
            }





        }
        System.out.println();
    }


}
