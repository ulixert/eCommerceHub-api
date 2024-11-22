package com.ulixert.ecommercehub.repository;

import com.ulixert.ecommercehub.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
