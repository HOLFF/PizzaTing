import models.*;


class PizzaFactory{
     private static PizzaFactory instance;

    enum Pizza {
        Diavolo("Diavolo"),
        Lysergsaeurediethylamid("Lysergsaeurediethylamid"),
        Nussidi("Nussidi");

        final String PizzaLabel;

        Pizza(final String PizzaLabel) {
            this.PizzaLabel = PizzaLabel;
        }
    }

    public PizzaFactory() throws IllegalStateException {
        if (PizzaFactory.instance != null) {
            throw new IllegalStateException("Factory has already been instantiated!");
        }
        PizzaFactory.instance = this;
    }

    public static synchronized PizzaFactory getInstance() {
        if (PizzaFactory.instance != null) {
            return PizzaFactory.instance;
        }
        PizzaFactory.instance = new PizzaFactory();
        return PizzaFactory.instance;
    }

    public IPizza getPizza(final Pizza typeapizza) throws IllegalArgumentException {
        switch (typeapizza) {
            case Diavolo:
                return new Diavolo();

            case Lysergsaeurediethylamid:
                return new Lysergsaeurediethylamid();

            case Nussidi:
                return new Nussidi();

            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }
}