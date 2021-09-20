package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class MainApp {

    public static void main(String[] args) {



        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Animals animals = context.getBean("animals", Animals.class);
//        animals.dosomething();

        ProductService productservice = context.getBean("prser", ProductService.class);
        productservice.productservice1.add(new Product(1, "Milk",  20));
        productservice.productservice1.add(new Product(2, "Meat",  230));
        productservice.productservice1.add(new Product(3, "Water",  50));
        productservice.productservice1.add(new Product(4, "Cheese",  600));
        productservice.productservice1.add(new Product(5, "Coffee",  100));
        productservice.productservice1.add(new Product(6, "Tea",  5));
        productservice.productservice1.add(new Product(7, "Strawberry",  45));
        productservice.productservice1.add(new Product(8, "Cake",  150));

//            productservice.printAll();

            String word = "Coffee";
            String word1 = "Tea";
            String word2 = "Cake";
            productservice.findbytitle(word);
            productservice.findbytitle(word1);
            productservice.findbytitle(word2);

        ((AnnotationConfigApplicationContext) context).close();


    }
}
