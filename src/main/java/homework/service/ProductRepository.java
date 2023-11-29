package homework.service;

import homework.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProducts();

    Product getProductById(int id);

    void addProduct(Product product);

    void deleteProduct(Product product);

    void updateProduct(Product product);

}