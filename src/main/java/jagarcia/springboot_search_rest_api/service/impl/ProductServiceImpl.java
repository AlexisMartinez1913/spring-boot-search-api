package jagarcia.springboot_search_rest_api.service.impl;

import jagarcia.springboot_search_rest_api.entity.Product;
import jagarcia.springboot_search_rest_api.repository.IProductRepository;
import jagarcia.springboot_search_rest_api.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private IProductRepository productRepository;

    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProduct(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }
}
