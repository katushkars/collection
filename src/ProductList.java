import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    //метод добавить новый товар
    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new IllegalArgumentException("такой ппродукт уже есть в списке");
        } else {
            this.products.add(product);

        }
    }

    //отметить, что он уже куплен
    public void checkProduct(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }

    // удалить продукт из списка
    public void removeProduct(String name) {
        Iterator<Product> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getName().equals(name)) {
                productsIterator.remove();
            }
        }

    }

    @Override
    public String toString() {
        return "ProductList{" +
                "products=" + products +
                '}';
    }
}
