package jagarcia.springboot_search_rest_api.service;

import jagarcia.springboot_search_rest_api.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> searchProduct(String query);

    Product createProduct(Product product);
}
