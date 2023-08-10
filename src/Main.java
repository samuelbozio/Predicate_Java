import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Mesa", 50.00));
        products.add(new Product("Tablet", 350.00));
        products.add(new Product("Notebook", 80.00));

//        products.removeIf(new ProductPredicate());
//        products.removeIf(Product::nonStaticProductPredicate);

//        Predicate<Product> pred = p -> p.getPrice() >= 100.00;
//        products.removeIf(pred);

        products.removeIf(p -> p.getPrice() >= 100.00);

        for (Product p : products) {
            System.out.println(p);
        }



    }
}