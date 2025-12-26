package Decorateur;

import Composants.Boisson;

public class Chocolat extends Decorator {
    public Chocolat(Boisson boisson) {
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
