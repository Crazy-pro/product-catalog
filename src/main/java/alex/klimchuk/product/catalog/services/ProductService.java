package alex.klimchuk.product.catalog.services;

import alex.klimchuk.product.catalog.domain.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);
    List<Product> listProducts();
}