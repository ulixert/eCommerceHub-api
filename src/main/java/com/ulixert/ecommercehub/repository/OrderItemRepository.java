package com.ulixert.ecommercehub.repository;

import com.ulixert.ecommercehub.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
