import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final Set<Product> products;
    private final String nameRecipe;

    public Recipe(Set<Product> products, String nameRecipe) {
        this.products = products;
        this.nameRecipe = nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                ", nameRecipe='" + nameRecipe + '\'' +
                '}';
    }
}
