package models;

public class Diavolo implements IPizza{
    final String[] Ingredientslist = {"Sauce","Spicey"};

    @Override
    public String[] getIngredientlist() {
        return this.Ingredientslist;
    }
}