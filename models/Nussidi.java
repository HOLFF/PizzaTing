package models;

public class Nussidi implements IPizza{
    final String[] Ingredientslist = {"Nussn","Speck"};


    @Override
    public String[] getIngredientlist() {
        return this.Ingredientslist;
    }
}