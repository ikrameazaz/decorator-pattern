package Decorateur;

import Composants.Boisson;

public class chocolat extends Decorator {
    public chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", chocolat";
    }
}
