package jagarcia.springboot_search_rest_api.repository;

import jagarcia.springboot_search_rest_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {

    //JPQL Query (Java Persistence Query Language)
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%') OR " +
            "p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

    //Native SQL Query
    @Query(value = "SELECT * FROM products p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%') OR " +
            "p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    List<Product> searchProductsSQL(String query);

}
