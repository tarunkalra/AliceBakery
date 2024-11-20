package com.tarun.week1.AliceBakery.Implementation;

import com.tarun.week1.AliceBakery.interfaces.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup {
    public String getSyruptype() {
        return "Chocolate syrup";
    }
}
