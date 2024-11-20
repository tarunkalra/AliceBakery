package com.tarun.week1.AliceBakery;

import com.tarun.week1.AliceBakery.interfaces.Frosting;
import com.tarun.week1.AliceBakery.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    private Frosting frosting;

    @Autowired
    private Syrup syrup;

    public String bakeCake() {
        return "Cake baked with " + frosting.getFrostType() + " and " + syrup.getSyruptype();
    }

}
