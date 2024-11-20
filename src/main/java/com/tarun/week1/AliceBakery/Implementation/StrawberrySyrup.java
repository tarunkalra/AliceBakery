package com.tarun.week1.AliceBakery.Implementation;

import com.tarun.week1.AliceBakery.interfaces.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup {
    public String getSyruptype() {
        return "Strawberry syrup";
    }
}
