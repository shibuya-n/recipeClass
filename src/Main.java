import java.util.*;


public class Main {

    public static String name;
    public static String ingredient;
    public static String instructions;
    public static void main(String[] args) {

        for (int i = 1 ; i <= 3; i++) {

            System.out.println("What is your recipe's name? ");
            name = getUserInput();
            System.out.println("What are your recipe's ingredients? ");
            ingredient = getUserInput();
            System.out.println("What are your recipe's instructions? ");
            instructions = getUserInput();

            Recipe x = new Recipe(name, ingredient, instructions);
            System.out.println("Recipe # " + i);
            System.out.println(x.displayRecipe());

        }
    }

    public static String getUserInput(){
        Scanner x = new Scanner(System.in);
        return x.nextLine();
    }
}