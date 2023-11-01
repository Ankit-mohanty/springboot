package org.jt.mathodsofjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product, String> {
    Optional<Product> findByProductName(String productName);// if we don't declare optional class it if the product is
                                                            // not avilable then it gives null pointer exception.

    List<Product> findByProductPriceBetween(double startPrice, double endPrice);
}
