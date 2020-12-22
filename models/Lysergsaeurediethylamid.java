package models;

public class Lysergsaeurediethylamid implements IPizza{
    final String[] Ingredientslist = {"Pilz","Ballert mies"};


    @Override
    public String[] getIngredientlist() {
        return this.Ingredientslist;
    }
}