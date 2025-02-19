package app.model;

import app.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Timer extends Animal {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
