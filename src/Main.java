import Composants.Boisson;
import Composants.Espresso;
import Composants.Sumatra;
import Decorateur.Caramel;
import Decorateur.Chantilly;
import Decorateur.Chocolat;

public class Main  {
    public static void main(String[] args) {
        // Scénario de Test
        // 1. Créer une boisson Sumatra.
        Boisson boisson = new Sumatra();
        System.out.println("------------------------------------------------");
        System.out.println("Boisson de base : " + boisson.getDescription());
        System.out.println("Coût : " + boisson.cout());

        // 2. La décorer avec Chocolat.
        boisson = new Chocolat(boisson);
        System.out.println("------------------------------------------------");
        System.out.println("Avec Chocolat : " + boisson.getDescription());
        System.out.println("Coût : " + boisson.cout());

        // 3. La décorer ensuite avec Caramel.
        boisson = new Caramel(boisson);
        System.out.println("------------------------------------------------");
        System.out.println("Avec Caramel : " + boisson.getDescription());
        System.out.println("Coût : " + boisson.cout());

        // 4. La décorer encore avec Chocolat (double dose).
        boisson = new Chocolat(boisson);
        System.out.println("------------------------------------------------");
        System.out.println("Avec double Chocolat : " + boisson.getDescription());
        System.out.println("Coût final : " + boisson.cout());

        System.out.println("------------------------------------------------");
        System.out.println("Test Espresso + Chantilly :");
        // Démontre l'utilisation de la classe 'Espresso' enveloppée directement par
        // 'Chantilly'
        Boisson espressoChantilly = new Chantilly(new Espresso());
        System.out.println("Description : " + espressoChantilly.getDescription());
        System.out.println("Coût : " + espressoChantilly.cout());
        System.out.println("------------------------------------------------");
    }

}
