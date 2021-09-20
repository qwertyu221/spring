package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animals {

    @Autowired
    Cat cat;

    @Autowired
    Dog dog;

    @Autowired
    Pig pig;


    public void dosomething(){
        System.out.println("Animals!! Make noise");
        cat.meow();
        dog.gav();
        pig.hru();

    }
}
