import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RecipeManager {

    // Define a class to store the recipe
    public static class Recipe {
        private String name;
        private ArrayList<String> ingredients;
        private String instructions;

        public Recipe(String name, ArrayList<String> ingredients, String instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
        }

        public String getName() {
            return name;
        }

        public ArrayList<String> getIngredients() {
            return ingredients;
        }

        public String getInstructions() {
            return instructions;
        }

        @Override
        public String toString() {
            return "Recipe: " + name + "\nIngredients: " + ingredients + "\nInstructions: " + instructions + "\n";
        }
    }

    // Store recipes in a map (recipe name -> Recipe object)
    private Map<String, Recipe> recipeBook = new HashMap<>();

    // Method to add a recipe
    public void addRecipe(String name, ArrayList<String> ingredients, String instructions) {
        Recipe newRecipe = new Recipe(name, ingredients, instructions);
        recipeBook.put(name, newRecipe);
        System.out.println("Recipe added: " + name);
    }

    // Method to view all recipes
    public void viewRecipes() {
        for (Recipe recipe : recipeBook.values()) {
            System.out.println(recipe);
        }
    }

    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();

        // Example recipe
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("2 cups flour");
        ingredients.add("1 cup sugar");
        ingredients.add("2 eggs");

        manager.addRecipe("Cake", ingredients, "1. Mix ingredients.\n2. Bake at 180°C for 30 minutes.");

        // View all recipes
        manager.viewRecipes();
    }
}
