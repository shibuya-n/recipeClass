public class Recipe {

    String name;
    String ingredients;
    String instructions;
    public Recipe(String x, String y, String z){
        name = x;
        ingredients = y;
        instructions = z;
    }


    public String displayRecipe(){
        return "name: " + name + " | ingredients: " + ingredients + " | instructions: " + instructions;
    }
}
