package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage extends Animal {
    private Animal animal1;
    private Animal animal2;
    private Timer timer;


    @Autowired
   public AnimalsCage(@Qualifier("cat") Animal animal1, @Qualifier("dog") Animal animal2, @Qualifier("timer") Timer timer) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
