package com.ulixert.ecommercehub.repository;

import com.ulixert.ecommercehub.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
