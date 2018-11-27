package com.company;
import java.util.LinkedList;
import java.util.List;

public class Pizza {


    private String description = " ";
    private double prix_total;
    private boolean veget;
    public double coeff;
    private List<Ingredient> _ingredients = new LinkedList<>();
    
    public String getDescription() {
        generate_description();
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix_total() {
        prixFinal();
        return prix_total;
    }

    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }

    public boolean isVeget() {
        return veget;
    }

    public void setVeget(boolean veget) {
        this.veget = veget;
    }

    public List<Ingredient> get_ingredients() {

            return _ingredients;
    }

    public void setBread(Ingredient br){
            _ingredients.add(br);
    }
    public void addIngredient(Ingredient ing){
        _ingredients.add(ing);
    }

    public void setSize(PizzaSize p){
        switch (p){
            case SMALL:
                coeff = 2;
                break;
                case MEDIUM:
                    coeff = 4;
                    break;
                    case LARGE:
                    coeff = 6;
                    break;
            }
        }

        public void prixFinal(){
            List<Ingredient> ingred = get_ingredients();
            for (Ingredient Ings : ingred) {
                prix_total += Ings.getPrix() * coeff;
            }
        }
        public void generate_description(){
            List<Ingredient> ing = get_ingredients();
                for (Ingredient anIng : ing) {
                    description += anIng.getNom();
                    description += ", ";
                }
                if(check_for_veggie()){
                    description += "is vegetarian.";
                }
                if(!check_for_veggie()){
                    description += "not vegetarian.";
                }
            }



        public boolean check_for_veggie(){
            List<Ingredient> ingred = get_ingredients();
            for (Ingredient Ings : ingred) {
                if(!Ings.isVeg())
                    return false;
            }
            return true;
        }


}
