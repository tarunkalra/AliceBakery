package com.tarun.week1.AliceBakery.Implementation;

import com.tarun.week1.AliceBakery.interfaces.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {
    public String getFrostType() {
        return "Chocolate frosting";
    }
}
