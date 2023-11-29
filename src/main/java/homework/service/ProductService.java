package homework.service;

import homework.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements ProductRepository {

    private static List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getProducts() {
        List<Product> productsCopy = new ArrayList<>(products);
        return productsCopy;
    }

    @Override
    public Product getProductById(int id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Dresiki.");
        product.setCategory("Odzież");
        product.setDescription("Eleganckie trzypaskowe dresiki");
        return product;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId() == updatedProduct.getId()) {
                products.set(i, updatedProduct);
                break;
            }
        }
    }
}