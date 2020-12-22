import models.IPizza;

public class Main {
    public static void main(String[] args) {
        final IPizza pizzaone = PizzaFactory.getInstance().getPizza(PizzaFactory.Pizza.Diavolo);
        final IPizza pizzatwo = PizzaFactory.getInstance().getPizza(PizzaFactory.Pizza.Lysergsaeurediethylamid);
        final IPizza pizzathree = PizzaFactory.getInstance().getPizza(PizzaFactory.Pizza.Nussidi);
        printIngdts(pizzaone.getIngredientlist());
        printIngdts(pizzatwo.getIngredientlist());
        printIngdts(pizzathree.getIngredientlist());
    }



    public static void printIngdts(String[] list){
        String out = "";
        for (String string : list) {
            out+=string + " ,";
        }
        System.out.println(out);
    }
}
