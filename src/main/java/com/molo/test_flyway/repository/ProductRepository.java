package com.molo.test_flyway.repository;

import com.molo.test_flyway.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
