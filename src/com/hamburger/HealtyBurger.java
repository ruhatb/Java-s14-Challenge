package com.hamburger;

public class HealtyBurger extends Hamburger {
    private Addition healthyAddition1;
    private  Addition healthyAddition2;

    public HealtyBurger(String name, String meat, BreadRolType breadRolType, Addition healthyAddition1, Addition healthyAddition2) {
        super(name, meat, breadRolType);
        this.healthyAddition1 = healthyAddition1;
        this.healthyAddition2 = healthyAddition2;
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }
}
