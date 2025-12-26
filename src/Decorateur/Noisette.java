package Decorateur;

import Composants.Boisson;

public class Noisette extends Decorator {
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Noisette";
    }
}
