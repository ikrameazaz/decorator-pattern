package Decorateur;

import Composants.Boisson;

public class Chantilly extends Decorator {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au Chantilly";
    }
}
