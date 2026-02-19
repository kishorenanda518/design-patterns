package com.designpatterens.DecoratorDesignPattren.topping;

import com.designpatterens.DecoratorDesignPattren.BasePizza;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
