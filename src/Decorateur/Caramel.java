package Decorateur;

import Composants.Boisson;

public class Caramel extends Decorator {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }
}
